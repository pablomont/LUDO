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
import Model.Jogador;
import Model.Peça;
import Model.PeçaAmarela;
import Model.PeçaAzul;
import Model.PeçaVerde;
import Model.PeçaVermelha;
import Util.EnumDado;
import Util.FrameOperation;
import View.PanelInicialView;
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
    private Jogador[] jogadores;
    private int jogadorDaVez = 0;

    private void finalizaJogo() {
        
    }
     
    public enum corDoJogadorDaVez {
       AMARELO, VERDE, AZUL, VERMELHO;
    }
    
  
    public int escolhaMaquinaDado() {
        int escolha = randomGenerator.nextInt(3)+1;
        
        if(getJogadorDaVez().getQtdPeçasNabase() == 3)
            escolha = 3;
        
        switch(escolha){
    
            case 1:  lancarDado(EnumDado.Primeiro);break;
            case 2:  lancarDado(EnumDado.Segundo);break;
            case 3:  lancarDoisDados();
        }
        
        return escolha;
    }
    
    
    public Jogador getJogadorDaVez(){
        return jogadores[jogadorDaVez];
    }
    
    public corDoJogadorDaVez getCorDoJogadorDaVez() {
       // if(jogadorDaVez > 3)
            //jogadorDaVez = 0;        
        
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
    
    public void lancarDado(EnumDado dado){
       //if(jogadorDaVez > 3)
            //jogadorDaVez = 0; 
       jogadores[jogadorDaVez].lancarDado(dado);     
    }
    
    public void lancarDoisDados(){  
        //if(jogadorDaVez > 3)
            //jogadorDaVez = 0;
       jogadores[jogadorDaVez].lancarDados();     

    }

    @Override
    public void mostrarView() {
        FrameOperation.setView(view);
        FrameOperation.setMaximized(false);
        FrameOperation.setResizable(false);
        FrameOperation.setSize(new Dimension(1271,833));
        FrameOperation.setLocation(new Point(80,20));
    }

    @Override
    public void viewAnterior() {
       new PanelInicialControl(new PanelInicialView()).mostrarView();
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
}
