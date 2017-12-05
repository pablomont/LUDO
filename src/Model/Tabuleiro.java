/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;

/**
 *
 * @author paabl
 */
public class Tabuleiro {
    
    private final int NUM_CASAS = 96;
    
    private Casa[] casas;
    
    private Tabuleiro() {
        casas = new Casa[NUM_CASAS];
        preencheCasas();
        
    }

    private void preencheCasas() {
        casas = new Casa[]{
            
            
        };
    }

   
 
}
