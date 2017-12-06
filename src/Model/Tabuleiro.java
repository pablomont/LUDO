/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author paabl
 */


public class Tabuleiro {
    
   
    private static Tabuleiro tabuleiro;
    private static ArrayList casas;
    
    private Tabuleiro() {
        casas = new ArrayList<Casa>();
        preencheCasas();
    }

    public static ArrayList getCasas() {
        if(tabuleiro == null)
                tabuleiro = new Tabuleiro();
        return casas;
    }
    
//    public static void addCasa(JLabel peao, Peça p){
//        casas.add(new Casa(peao,p));
//    }

    private void preencheCasas() {
       casas = new ArrayList<Casa>(Arrays.asList(
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),
               new Casa(),new Casa(),new Casa(),new Casa(),new Casa(),new Casa()
       ));
    } 
}
