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
public class User {
    
    private final Peça _p;
     
    public User() {
        _p = new Peça();
    }
     
    public boolean jogar(){
        int resultLancamento = Tabuleiro.lancarDados();
        _p.moveCasa(resultLancamento);
        
        return _p.getNumCasa() == Tabuleiro.NUMCASAFINAL;
        
    }
     
    
}
