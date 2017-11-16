/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Jogador;

/**
 *
 * @author paabl
 */
public class TabuleiroControl {
    
    

    public Jogador[] jogadores;
    public int jogadorDaVez = 0;
    
    public TabuleiroControl() {
        jogadores = new Jogador[]{
            new Jogador(),
            new Jogador(),
            new Jogador(),
            new Jogador() 
        };
    }         
    
    public void jogar(){
        
        
        if(jogadorDaVez > 3)
            jogadorDaVez = 0;
        
       jogadores[jogadorDaVez].jogar();
       jogadorDaVez++;
       
       
    }
    
    
}
