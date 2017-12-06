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
public abstract class Peça {
    
    protected CorPeça cor;
    protected boolean naBase = true;
    protected boolean chegada = false;
    protected Point[] caminho;
    protected final int NUM_CASAS = 74;
    protected int casaAtual = -1;
    protected int casaAntiga;
    protected Point locationBase;

    public Point getLocationBase() {
        return locationBase;
    }

    public void setNaBase(boolean naBase) {
        this.naBase = naBase;
    }

    public CorPeça getCor() {
        return cor;
    }
   
    
    public boolean getChegada() {
        return chegada;
    }

    public boolean isNaBase() {
        return naBase;
    }
 
    
    
    public int getCasaAtual() {
        return casaAtual;
    }
    
    public Peça() {
        this.caminho = new Point[74];
    }
   
    protected abstract void preencheCaminho();
   
    public Point mover(int qtdCasasParaAndar){
        Point p = null;
        
        this.casaAntiga = this.casaAtual;
        this.casaAtual += qtdCasasParaAndar;
        
        if(casaAtual == 74)
            chegada = true;
          
        try{
            p = getPointCasaAtual();
        }
        catch(ArrayIndexOutOfBoundsException e){
            this.casaAtual -= qtdCasasParaAndar;
            chegada = false;
        }
        return p;
    }
    
    public Point moverFirstCasa(){
        this.naBase = false;
        this.casaAtual = 0;
        return caminho[casaAtual];
    }
    
    public  Point getPointCasaAtual() throws ArrayIndexOutOfBoundsException{
        return caminho[casaAtual];
    }     

    public Point getCasaPointAntiga() {
        return caminho[casaAntiga];
    }

    public int getCasaIndexAntiga() {
        return this.casaAntiga;
    }

    public int getIndexCasaAtual() {
       return this.casaAtual;
    }

    public Point getPoint(int i) {
         return caminho[i];
    }
    
    
    
 }
