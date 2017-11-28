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
    public boolean naBase = true;
    protected Point[] caminho;
    protected final int NUM_PEÇAS = 74;
    protected int casaAtual = -1;


    public Peça() {
        this.caminho = new Point[74];
    }
   
    protected abstract void preencheCaminho();
    
    public Point mover(int qtdCasasParaAndar){
        
        if(naBase){
            this.casaAtual = 0;
            naBase = false;
        }
        
        else{
            this.casaAtual += qtdCasasParaAndar;
        }
        
        return getCasa();
    }
    
    
    public  Point getCasa(){
        return caminho[casaAtual];
    }     
}
