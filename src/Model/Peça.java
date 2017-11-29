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
    public boolean chegada = false;
    protected Point[] caminho;
    protected final int NUM_CASAS = 74;
    protected int casaAtual = -1;

    public boolean getChegada() {
        return chegada;
    }
 
    public int getCasaAtual() {
        return casaAtual;
    }
    
    public Peça() {
        this.caminho = new Point[74];
    }
   
    protected abstract void preencheCaminho();
    
    public Point mover(int qtdCasasParaAndar)throws ArrayIndexOutOfBoundsException{
        
        if(naBase){
            this.casaAtual = 0;
            naBase = false;
        }
        
        else{
            this.casaAtual += qtdCasasParaAndar;
            if(casaAtual == 74)
                chegada = true;
        }
        
        return getPointCasa();
    }
    
    
    public  Point getPointCasa() throws ArrayIndexOutOfBoundsException{
        return caminho[casaAtual];
    }     
    
    
}
