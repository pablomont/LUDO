/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import data.dao.RankingDAO;

/**
 *
 * @author Jose George
 */
public class RankingModel {
    
     public static Ranking USER_LOGGED;
    private RankingDAO myDAO; 
    
    
    public RankingModel(){
        this.myDAO = new RankingDAO();
    }
    
    public void insertRanking(Ranking newRanking) throws Exception{
        try {
            myDAO.INSERT(newRanking);
        } catch (Exception ex) {
            System.err.print("ERROR:::: "+ex.getMessage());
        }
    }

    public void verRanking(Ranking rank) {
        
          Ranking searchRanking;
        try {
            searchRanking = myDAO.verficaRanking(rank);
            USER_LOGGED = searchRanking;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
