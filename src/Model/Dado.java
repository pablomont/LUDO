/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Random;

/**
 *
 * @author paabl
 */
public class Dado {
    
    
    private static Dado dado;
    private static int _num;
    private static Random randomGenerator;
   
    public Dado() {
        randomGenerator = new Random();
    }

    public static void setNum(int n) {
        if(dado == null)     
            dado = new Dado();
        _num = n;
    }
    
    public static int RandomNum(){
        if(dado == null)     
            dado = new Dado();
        
        _num = randomGenerator.nextInt(6)+1;
        return getNum();
    }
    
    public static int getNum() {
        return _num;
    }  
}
