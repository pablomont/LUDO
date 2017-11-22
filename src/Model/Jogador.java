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
public class Jogador {
    
    private final PeçaAmarela _p;
    
     
    public Jogador() {
        _p = new PeçaAmarela();
    }

    public void jogar(){
       // int resultLancamento = Tabuleiro.lancarDados();
        
        
        //return _p.getNumCasa() == Tabuleiro.NUMCASAFINAL;
        Tabuleiro.lancarDados();

        
    }

    public PeçaAmarela getPeca() {
        return _p;
    }
     
    
}
