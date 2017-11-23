/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;

/**
 *
 * @author Lufh
 */
public abstract class Peça {
    protected Point[] caminho;
    protected final int NUM_PEÇAS = 74;

    public Peça() {
        this.caminho = new Point[74];
    }
   
    protected abstract void preencheCaminho();
    
    public abstract Point getCasa(int i);
        
}
