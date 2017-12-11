/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CorPeça;
import static Model.CorPeça.AMARELO;
import static Model.CorPeça.AZUL;
import static Model.CorPeça.VERDE;
import static Model.CorPeça.VERMELHO;
import Model.Dado;
import Model.Jogador;
import Model.Peça;
import Model.PeçaAmarela;
import Model.PeçaAzul;
import Model.PeçaVerde;
import Model.PeçaVermelha;
import Util.FrameOperation;
import View.PanelMenuView;
import View.PanelTabuleiroView;
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


    
    public Jogador getJogador(CorPeça cor){
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
     

  
    public int escolhaMaquinaDado() {
        return 0;
    }
    
    
    public Jogador getJogadorDaVez(){
        return jogadores[jogadorDaVez];
    }
    
    public CorPeça getCorDoJogadorDaVez() {
       
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
            new Jogador(new Peça[]{new PeçaAmarela(0, new Point(480,530)),new PeçaAmarela(new Point(440,570)),new PeçaAmarela(new Point(410,530)),new PeçaAmarela(new Point(440,500))}),
            new Jogador(new Peça[]{new PeçaVerde(0,new Point(340,150)),new PeçaVerde(new Point(370,120)),new PeçaVerde(new Point(410,150)),new PeçaVerde(new Point(370,190))}),
            new Jogador(new Peça[]{new PeçaVermelha(0,new Point(720,90)),new PeçaVermelha(new Point(750,50)),new PeçaVermelha(new Point(790,90)),new PeçaVermelha(new Point(750,120))}),
            new Jogador(new Peça[]{new PeçaAzul(0,new Point(780,470)),new PeçaAzul(new Point(820,430)),new PeçaAzul(new Point(850,470)),new PeçaAzul(new Point(820,500))}) 
        };
    }         

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(true);
        FrameOperation.setResizable(true);      
    }

    @Override
    public void viewAnterior() {
        
        
       new PanelMenuControl(new PanelMenuView()).mostrarView();
    }

    public boolean proximoJogadorDaVez() {
        
       if(jogadores[jogadorDaVez].getPeçaEscolhida().getChegada())
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
                jogadores[jogadorDaVez].escolhePeçaRandomForaDaBase().mover(Dado.getNum());
            }
            else{
                Peça p = jogadores[jogadorDaVez].escolhePeçaRandomDaBase();
                return p.moverFirstCasa();
      
            }
        }
        else{
            if(Dado.getNum() != 6){
                if(!jogadores[0].getPeçaEscolhida().isNaBase())
                    jogadores[0].getPeçaEscolhida().mover(Dado.getNum()); 
            }
            else{
                if(!jogadores[0].getPeçaEscolhida().isNaBase())
                     jogadores[0].getPeçaEscolhida().mover(6); 
                else
                    jogadores[0].getPeçaEscolhida().moverFirstCasa(); 
            }
        }
        return null;
        
    }    


}
