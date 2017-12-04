/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Jogador;
import data.dao.JogadorDAO;


/**
 *
 * @author professor Daniel
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

    public void doLogin(Jogador j) {
          
        Jogador searchUser;
        try {
            searchUser = myDAO.verficaLogin(j);
            USER_LOGGED = searchUser;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
}
