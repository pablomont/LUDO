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
    private static Dado _d1;

    static void lancarDado() {
       if(tabuleiro == null)
            tabuleiro = new Tabuleiro();
       _d1.RandomNum();
    }

    private Tabuleiro() {
        _d1 = new Dado();
    }

    public static void setNum(int num, int num2){
        _d1.setNum(num);
    }
    
    public static int getNumDadoUm() {
        return _d1.getNum();
    }

    
}
