/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import data.dao.JogadorDAO;
import java.util.List;


/**
 *
 * @author José George
 */
public class JogadorModel {
    
    public static Jogador USER_LOGGED;
    private static List<Jogador> USERS;
    private static JogadorDAO myDAO; 
    
    
    
    public JogadorModel(){
        myDAO = new JogadorDAO();
    }

    public static List<Jogador> getJogadores() {
        USERS = myDAO.SELECTALL();
        return USERS;
    }
    
    public void insertUser(Jogador newUser) throws Exception{
        try {
            myDAO.INSERT(newUser);
        } catch (Exception ex) {
            System.err.print("ERROR:::: "+ex.getMessage());
        }
    }

    public void doLogin(Jogador j) throws Exception {
          
        Jogador searchUser;
        
        searchUser = myDAO.SELECTONE(j);
        USER_LOGGED = searchUser;
    }
    
    public static void updateUser(){
    
        try {
            myDAO.UPDATE(USER_LOGGED);
        } catch (Exception ex) {
            System.err.print("ERROR:::: "+ex.getMessage());
        }
    }
    
 
}
