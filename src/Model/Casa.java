/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author paabl
 */
public class Casa {
    
  private final Point posicao;

    public Point getPosicao() {
        return posicao;
    }
    private JLabel peao;
    private Peça peça;
    private boolean ocupada;
    private Casa estadoAnterior;
    
    public Casa(int x, int y){
        this.posicao = new Point(x,y); 
        ocupada = false;
    }

    private JLabel getPeao(){
        return peao;  
    }
    
    private Peça getPeça(){
    
        return peça;
    }
    
    public void addPeao(JLabel peao,Peça peça){
        //if(ocupada)
            estadoAnterior = this;
        this.peao = peao;
        this.peça = peça;
        ocupada = true;
    }
    
    public JLabel getPeaoAnterior(){
        return estadoAnterior.getPeao();
    }
    
    public Peça getPeçaAnterior(){
        return estadoAnterior.getPeça();
    }
   
    public void removePeao(){
        this.peao = null;
        this.peça = null;
        ocupada = false;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }
}
