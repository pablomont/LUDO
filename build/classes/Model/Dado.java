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
    private int _num;
    private final Random randomGenerator;
   
    public Dado() {
        randomGenerator = new Random();
        //this._num = randomGenerator.nextInt(6)+1;
    }

    public void setNum(int _num) {
        this._num = _num;
    }

    public void setRandomNum(){
        this._num = randomGenerator.nextInt(6)+1;
    }
    
    public int getNum() {
        return _num;
    }
    
    
    
}
