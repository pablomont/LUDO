/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import data.dao.JogadorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author José George
 */
public class JogadorModel {
    
    public static Jogador USER_LOGGED;
    private JogadorDAO myDAO; 
    
    
    public JogadorModel(){
        this.myDAO = new JogadorDAO();
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
        
            searchUser = myDAO.verficaLogin(j);
            USER_LOGGED = searchUser;
        
    }
 
}
