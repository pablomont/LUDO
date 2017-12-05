/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import Model.Jogador;
import data.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        String sql = "INSERT INTO Usuario (nome, dataDeNascimento, avatar, login, senha) VALUES(?,?,?,?,?)";
       try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            
            preparedStatement.setString(1,jogador.getName());
            preparedStatement.setString(2,jogador.getDataDeNascimento());
            preparedStatement.setString(3,jogador.getAvatar());
            preparedStatement.setString(4,jogador.getLogin());
            preparedStatement.setString(5,jogador.getSenha());
            
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
            
        } catch (SQLException ex) {
     
            switch(ex.getErrorCode()){
            case 19:
                System.err.println("Usuário já existe "+" E: ("+ex.getMessage()+")");
                return;
            }
            System.err.println("Erro desconhecido ao inserir " +ex.getMessage());
            return;
        }
    }
    
    public Jogador verficaLogin(Jogador user) throws Exception
    {
        String sql= "SELECT * FROM Usuario WHERE login = ? AND senha = ?";
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
                
                preparedStatement.close();
                conexao.close();
                System.out.println("DADOS DO JOGADOR LOGADO -> "+ "\nNome:"+user.getName()
                +"\nSenha: "+user.getSenha() + "\nNome do avatar: "+user.getAvatar());

                return user;
             }
            
         
            preparedStatement.close();
            
            
            conexao.close();
            throw new Exception("Usuário ou senha incorreto.");
            
        } catch (SQLException ex) {
           System.out.println("Erro ao realizar login de usuário "+user.getLogin()+" E:"+ex.getMessage());
        }
        return null;
    }
    
    @Override
    public void UPDATE(Object myDAO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DELETE(Object myDAO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
