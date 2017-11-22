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
public class PeçaAmarela {

    private int _numCasa;

    public int getNumCasa() {
        return  _numCasa;
    }

    public void moveCasa(int num) {
        while(_numCasa < num)
            _numCasa++;
    }
    
}
