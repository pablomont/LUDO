/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.PanelTabuleiroControl.corDoJogadorDaVez.AMARELO;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.AZUL;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.VERDE;
import static Control.PanelTabuleiroControl.corDoJogadorDaVez.VERMELHO;
import Model.Dado;
import Model.Jogador;
import Model.Peça;
import Model.PeçaAmarela;
import Model.PeçaAzul;
import Model.PeçaVerde;
import Model.PeçaVermelha;
import Util.FrameOperation;
import View.FramePrincipal;
import View.PanelMenuView;
import View.PanelTabuleiroView;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Random;


/**
 *
 * @author paabl
 */
public class PanelTabuleiroControl extends AbstractControl{
    private final Random randomGenerator;
    PanelTabuleiroView view;
    private final Jogador[] jogadores;
    private int jogadorDaVez = 0;
    private Peça peça; 


    
    public Jogador getJogador(corDoJogadorDaVez cor){
        switch(cor){
            case AMARELO: return jogadores[0]; 
            case VERDE: return jogadores[1];
            case VERMELHO:  return jogadores[2];
            case AZUL:  return jogadores[3];
        }
        
        return null;
    }
    

    private void finalizaJogo() {
        
    }
     
    public enum corDoJogadorDaVez {
       AMARELO, VERDE, AZUL, VERMELHO;
    }
    
  
    public int escolhaMaquinaDado() {
        return 0;
    }
    
    
    public Jogador getJogadorDaVez(){
        return jogadores[jogadorDaVez];
    }
    
    public corDoJogadorDaVez getCorDoJogadorDaVez() {
       
        switch(jogadorDaVez){
            case 0: return AMARELO;
            case 1: return VERDE;
            case 2: return VERMELHO;
            case 3: return AZUL;
        }
        return null;
    }
    
    
    public PanelTabuleiroControl(PanelTabuleiroView view) {
        randomGenerator = new Random();
        this.view = view;
        jogadores = new Jogador[]{
            new Jogador(new Peça[]{new PeçaAmarela(0),new PeçaAmarela(),new PeçaAmarela(),new PeçaAmarela()}),
            new Jogador(new Peça[]{new PeçaVerde(0),new PeçaVerde(),new PeçaVerde(),new PeçaVerde()}),
            new Jogador(new Peça[]{new PeçaVermelha(0),new PeçaVermelha(),new PeçaVermelha(),new PeçaVermelha()}),
            new Jogador(new Peça[]{new PeçaAzul(0),new PeçaAzul(),new PeçaAzul(),new PeçaAzul()}) 
        };
    }         

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(true);
        FrameOperation.setResizable(false);
    }

    @Override
    public void viewAnterior() {
       new PanelMenuControl(new PanelMenuView()).mostrarView();
    }

    public boolean proximoJogadorDaVez() {
        
       if(jogadores[jogadorDaVez].getPeçaEscolhida().chegada)
            jogadores[jogadorDaVez].incrementaNumPeçasNaChegada(getCorDoJogadorDaVez());
       
       if(jogadores[jogadorDaVez].venceu()){
           return false;
       }
       else{
            jogadorDaVez++;

            if(jogadorDaVez > 3)
                jogadorDaVez = 0; 
            return true;
       }    
    }  
    
    public Point movimentaPeao(){
        
        
        if(jogadorDaVez != 0){
            if(Dado.getNum() != 6){
                return jogadores[jogadorDaVez].escolhePeçaRandomForaDaBase().mover(Dado.getNum());
            }
            else{
                Peça p = jogadores[jogadorDaVez].escolhePeçaRandomDaBase();
                if(p.naBase)
                    return p.moverFirstCasa();
                return p.mover(Dado.getNum());
            }
        }
        else{
            if(Dado.getNum() != 6 && !jogadores[0].getPeçaEscolhida().naBase)
                 return jogadores[0].getPeçaEscolhida().mover(Dado.getNum()); 
            else if(Dado.getNum() == 6){
                if(jogadores[0].getPeçaEscolhida().naBase)
                    return jogadores[0].getPeçaEscolhida().moverFirstCasa();
                else{
                     return jogadores[0].getPeçaEscolhida().mover(Dado.getNum()); 
                }
            }
            //Dado.getNum() != 6 && jogadores[0].getPeçaEscolhida().naBase
            else{
                return null;
            }
        }
        
    }    
        
//        if(jogadores[jogadorDaVez].getPeçaEscolhida().naBase && Dado.getNum() == 6)
//            return jogadores[jogadorDaVez].getPeçaEscolhida().mover(Dado.getNum()); 
//        
//        else if(!jogadores[jogadorDaVez].getPeçaEscolhida().naBase){
//            return jogadores[jogadorDaVez].getPeçaEscolhida().mover(Dado.getNum()); 
//        }
       
}
