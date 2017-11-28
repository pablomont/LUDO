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

    static void lancarDadoUm() {
       if(tabuleiro == null)
            tabuleiro = new Tabuleiro();
       _d1.setRandomNum();
    }

    static void lancarDadoDois() {
        if(tabuleiro == null)
            tabuleiro = new Tabuleiro();
        
        _d2.setRandomNum();
    }

    private Tabuleiro() {
        _d1 = new Dado();
        _d2 = new Dado();
    }

    public static void setNum(int num, int num2){
        _d1.setNum(num);
        _d2.setNum(num2);
    }
    
    public static int getNumDadoUm() {
        return _d1.getNum();
    }

    public static int getNumDadoDois() {
        return _d2.getNum();
    }

    public static void lancarDados(){
        if(tabuleiro == null)
            tabuleiro = new Tabuleiro();
        
        //Lançando os dados
        _d1.setRandomNum();
        _d2.setRandomNum();

    } 
}
