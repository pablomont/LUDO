/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import Model.Ranking;
import data.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose George
 */
public class RankingDAO implements DAO {
    
     private Connection conexao = null;
    
    public RankingDAO(){
        this.conexao = DataBase.getConnection();
    }
    

    @Override
    public void INSERT(Object myDAO) throws Exception {
        Ranking ranking = (Ranking) myDAO;
        String sql = "INSERT INTO RankingJogo (login, quantVitorias, partidasJogadas) VALUES(?,?,?)";
       try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1,ranking.getLogin());
            preparedStatement.setInt(2,ranking.getQuantidadeVitorias());
            preparedStatement.setInt(3,ranking.getPartJogadas());
            
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DELETE(Object myDAO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Ranking verficaRanking(Ranking rank) {
        
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
           
            
        } catch (SQLException ex) {
           System.out.println("Erro ao realizar abertura do ranking para o user "+rank.getLogin()+" E:"+ex.getMessage());
        }
        return null;
    }
    
    
    
}
