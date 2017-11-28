/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.EnumDado;

/**
 *
 * @author paabl
 */
public class Jogador {
    

    public Jogador() {
        
    }
    
    public void lancarDados(){
        Tabuleiro.lancarDados();
    }
    
    public void lancarDado(EnumDado dado){
        if(dado == EnumDado.Primeiro)
            Tabuleiro.lancarDadoUm();
        else{
            Tabuleiro.lancarDadoDois();
        }
    }

}
