/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import Control.PanelRegisterControl;
import Model.Jogador;
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
 * @author José George
 */
public class JogadorDAO implements DAO{

    
    private Connection conexao = null;
    
    public JogadorDAO(){
        this.conexao = DataBase.getConnection();
    }
    
    
    
    
    @Override
    public void INSERT(Object myDAO) throws Exception {
        Jogador jogador = (Jogador) myDAO;
        String sql = "INSERT INTO Jogador (nome, dataDeNascimento, avatar, login, senha, qtdPartidas, qtdVitorias) VALUES(?,?,?,?,?,?,?)";
       try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1,jogador.getName());
            preparedStatement.setString(2,jogador.getDataDeNascimento());
            preparedStatement.setString(3,jogador.getAvatar());
            preparedStatement.setString(4,jogador.getLogin());
            preparedStatement.setString(5,jogador.getSenha());
            preparedStatement.setInt(6, jogador.getQtdPartidas());
            preparedStatement.setInt(7, jogador.getQtdVitorias());
            
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
        
        } catch (SQLException ex) {
     
            switch(ex.getErrorCode()){
            case 19:
                JOptionPane.showMessageDialog(null,"Por favor, tente outro login");
                PanelRegisterControl.cadastroSucesso = false;
                System.err.println("Usuário já existe "+" E: ("+ex.getMessage()+")");
                return;
            }
            System.err.println("Erro desconhecido ao inserir " +ex.getMessage());
            return;
        }
    }
    
    public Jogador SELECTONE(Jogador user) throws Exception
    {
        String sql= "SELECT * FROM Jogador WHERE login = ? AND senha = ?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getSenha());
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setDataDeNascimento(rs.getString("dataDeNascimento"));
                user.setAvatar(rs.getString("avatar"));
                user.setName(rs.getString("nome")); 
                user.setQtdPartidas(rs.getInt("qtdPartidas")); 
                user.setQtdVitorias(rs.getInt("qtdVitorias")); 
                
                preparedStatement.close();
                conexao.close();
           

                return user;
             }
            
         
            preparedStatement.close();
            conexao.close();
            throw new Exception("Usuário ou senha incorreto");
            
        } catch (SQLException ex) {
           System.out.println("Erro ao realizar login de usuário "+user.getLogin()+" E:"+ex.getMessage());
        }
        return null;
    }
    
    public List<Jogador> SELECTALL(){
        
        conexao = DataBase.getConnection();
        Jogador jogador;
        List<Jogador> jogadores = new ArrayList();
        String sql= "SELECT * FROM Jogador ORDER BY qtdVitorias DESC; ";
        try {
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                jogador = new Jogador(rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("dataDeNascimento"),
                        rs.getString("avatar"),
                        rs.getString("nome"),
                        rs.getInt("qtdPartidas"),
                        rs.getInt("qtdVitorias")
                );
                
                jogadores.add(jogador);
                
             }
           
            preparedStatement.close();
            conexao.close();
          
            
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        return jogadores;
    }

    @Override
    public void UPDATE(Object myDAO) throws Exception {
        conexao = DataBase.getConnection();
        Jogador jogador = (Jogador) myDAO;
        String sql = "UPDATE Jogador SET qtdVitorias = ? , "
                + "qtdPartidas = ? "
                + "WHERE login = ?";
        
         try {
            PreparedStatement pstmt = conexao.prepareStatement(sql); 
 
            // set the corresponding param
            pstmt.setInt(1, jogador.getQtdVitorias());
            pstmt.setInt(2,  jogador.getQtdPartidas());
            pstmt.setString(3, jogador.getLogin());
            // update 
            pstmt.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("ERROR NO UPDATE:       "+e.getMessage());
        }
    }

    @Override
    public void DELETE(Object myDAO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}

