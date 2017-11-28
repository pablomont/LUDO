/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.user;

import Model.Jogador;
import data.dao.UsuarioDAO;


/**
 *
 * @author professor Daniel
 */
public class JogadorModel {
    
    public static Jogador Usuario; 
    private UsuarioDAO myDAO; 
    
    
    public JogadorModel(){
        this.myDAO = new UsuarioDAO();
    }
    
    public void insertUser(Jogador newUser) throws Exception{
        try {
            
            myDAO.INSERT(newUser);
        } catch (Exception ex) {
            System.err.print("ERROR:::: "+ex.getMessage());
        }
    }
    
}
