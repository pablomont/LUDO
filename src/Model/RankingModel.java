/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import data.dao.RankingDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose George
 */
public class RankingModel {
    
    public static UserRanking USER_LOGGED;
    private  static  List<UserRanking> USERS;
    private static RankingDAO myDAO; 
    
    
    public RankingModel(){
        this.myDAO = new RankingDAO();
    }
    
    public void insertUserRanking(UserRanking newRanking) throws Exception{
        try {
            myDAO.INSERT(newRanking);
            //JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,"Por favor, tente outro login");
            System.err.print("ERROR:::: "+ex.getMessage());
        }
    }

    public void getUserRanking(UserRanking rank) {
        
        UserRanking searchUserRanking;
        try {
            searchUserRanking = myDAO.getUserRanking(rank);
            USER_LOGGED = searchUserRanking;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static List<UserRanking> getRanking(){
    
        USERS =  myDAO.getAllUsersRanking();
        return USERS;
    }
}
