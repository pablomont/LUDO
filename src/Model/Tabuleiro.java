/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author paabl
 */
public class Tabuleiro {
    
    private static Tabuleiro tabuleiro;
    public static final int NUMCASAFINAL = 60;
    private static Dado _d1, _d2;

    private Tabuleiro() {
        _d1 = new Dado();
        _d2 = new Dado();
    }

    public static int numD1() {
        return _d1.getNum();
    }

    public static int numD2() {
        return _d2.getNum();
    }

    public static int lancarDados(){
        if(tabuleiro == null)
            tabuleiro = new Tabuleiro();
        
        //Lançando os dados
        _d1.setRandomNum();
        _d2.setRandomNum();
        
        return numD1()+numD2();      
    } 
}
