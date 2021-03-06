/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author José George
 */
public class DataBase {

    public boolean createDataBase(){
        Connection conexao = getConnection();
        PreparedStatement prepSteaStatement;
        
        String sqlUsuario = "CREATE TABLE IF NOT EXISTS Jogador ( "
                            +"nome VARCHAR(50) NOT NULL,  "
                            +"dataDeNascimento VARCHAR(10) NOT NULL,   "
                            +"avatar TEXT NOT NULL,             "
                            +"login VARCHAR(10),"
                            +"senha VARCHAR(20),"
                            +"qtdPartidas INTEGER,"  
                            +"qtdVitorias INTEGER,"  
                            +"PRIMARY KEY(login));"; 
        
        
        try {
            prepSteaStatement = conexao.prepareStatement(sqlUsuario);
            prepSteaStatement.execute();
        } catch (SQLException ex) {
                System.err.println("Fail on create table [Jogador] (E: "+ex.getMessage()+")");
            return false;
        }
        
       
        return true;
    }
    
    public static Connection getConnection() {
         Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:ludo.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            System.err.println("Falha ao conectar com banco de dados\n"+e.getMessage());
        }
        return conn;
    }    
}
