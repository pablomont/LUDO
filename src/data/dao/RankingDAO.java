/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import Model.UserRanking;
import data.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose George
 */
public class RankingDAO implements DAO {
//    public static int quantVitorias = 0; 
//    public static int partidasJogadas = 0;
    private Connection conexao = null;
    
     
    public RankingDAO(){
        this.conexao = DataBase.getConnection();
    }
    

    @Override
    public void INSERT(Object myDAO) throws Exception {
        UserRanking userRanking = (UserRanking) myDAO;
        String sql = "INSERT INTO RankingJogo (login, quantVitorias, partidasJogadas) VALUES(?,?,?)";
       try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1,userRanking.getLogin());
            preparedStatement.setInt(2,userRanking.getQuantidadeVitorias());
            preparedStatement.setInt(3,userRanking.getPartJogadas());
            
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
            
        } catch (SQLException ex) {
     
            switch(ex.getErrorCode()){
            case 19:
                System.err.println("ERROR AO CRIAR RANKING PARA O USER "+" E: ("+ex.getMessage()+")");
                return;
            }
            System.err.println("Erro desconhecido ao criar ranking" +ex.getMessage());
            return;
        }
    }
    
  
       
    @Override
    public void UPDATE(Object myDAO) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        UserRanking ranking = (UserRanking) myDAO;
        String sql = "UPDATE RankingJogo SET quantVitorias = ? , "
                + "partidasJogadas = ? "
                + "WHERE login = ?";
        
         try {
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
 
            // set the corresponding param
            pstmt.setInt(1, ranking.getQuantidadeVitorias());
            pstmt.setInt(2, ranking.getPartJogadas());
            pstmt.setString(3, ranking.getLogin());
            System.out.println("uptade rolandooooo");
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR NO UPDATE:       "+e.getMessage());
        }
    }

    @Override
    public void DELETE(Object myDAO) throws Exception {
        
    }
    
    //Esse método retorna todas as linhas da tabela RankingJogo
    public List<UserRanking> getAllUsersRanking(){
        conexao = DataBase.getConnection();
        List<UserRanking> usersRanking = new ArrayList<>();
        String sql= "SELECT * FROM RankingJogo ORDER BY quantVitorias DESC;";
         
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
             while(rs.next()){
                 UserRanking userRanking = new UserRanking(rs.getString("login"),rs.getInt("quantVitorias"),rs.getInt("partidasJogadas")){};
                 usersRanking.add(userRanking);
             
             }
             preparedStatement.close();
             conexao.close();
            
        } catch (SQLException ex) {
           System.out.println("error code: "+ex.getErrorCode()+" State: "+ex.getSQLState()+" mensagem"+ex.getMessage());
        }
        
        return usersRanking;
    
    }
    
    //Esse método retorna uma linha da tabela RankingJogo
    public UserRanking getUserRanking(UserRanking rank) throws  Exception  {
        
        String sql= "SELECT * FROM RankingJogo WHERE login = ? ";
         try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1, rank.getLogin());
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                rank.setLogin(rs.getString("login"));
                rank.setQuantidadeVitorias(rs.getInt("quantVitorias"));
                rank.setPartJogadas(rs.getInt("partidasJogadas"));
               
                
                preparedStatement.close();
                conexao.close();
                System.out.println("DADOS DO RANKING DO JOGADOR ATUALMENTE LOGADO -> "+ "\nlOGIN: "+rank.getLogin()
                +"Partidas Jogadas: "+rank.getPartJogadas() + " quantViórias: "+ rank.getQuantidadeVitorias());

                return rank;
             }
            
            preparedStatement.close();
            conexao.close();
            throw new Exception("Usuário ou senha incorreto.");
          } catch (SQLException ex) {
           System.out.println("Erro");
        }
        return null;
    }
    
    
    
}
