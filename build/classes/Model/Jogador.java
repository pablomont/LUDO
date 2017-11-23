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
    
public enum DadoEscolhido {
       DadoUm, DadoDois;
    }
       public Jogador() {
        
    }
    
    public void lancarDados(){
        Tabuleiro.lancarDados();
    }
    
     public void lancarDado(DadoEscolhido dado){
         if(dado == DadoEscolhido.DadoUm)
             Tabuleiro.lancarDadoUm();
         else{
             Tabuleiro.lancarDadoDois();
         }
     }

}
