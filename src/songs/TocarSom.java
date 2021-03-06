/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songs;

import java.io.*;
import sun.audio.*;

/**
 *
 * @author Widson
 */

public class TocarSom {
    
    private static InputStream in ;  
    private static AudioStream audio;
    private static String click;
    private static String jogandoDados;
    private static String movendoPinos;
    private static String trilhaDecorrente;
    private static TocarSom tocarSom ;

    public TocarSom(){
        //Os comandos abaixo servem para generalizar os diretorios dos arquivos de musica
        click = System.getProperty("user.dir")+"\\src\\songs\\click.wav";
      
        
        jogandoDados = System.getProperty("user.dir")+"\\src\\songs\\jogando_dados.wav";
      
        
        movendoPinos = System.getProperty("user.dir")+"\\src\\songs\\movendo_pino.wav";
       
        
        trilhaDecorrente = System.getProperty("user.dir")+"\\src\\songs\\trilha_decorrente.wav";
    }
    
        
    public void tocaSom(String nome) throws IOException{
        if(tocarSom == null)
            tocarSom = new TocarSom();
        
        //if(nome.equals("click"))
            in = getClass().getResourceAsStream(nome);
//        else if(nome.equals("jogando_dados"))
//            in = new FileInputStream(jogandoDados);
//        else if(nome.equals("movendo_pino"))
//            in = new FileInputStream(movendoPinos);
//        else
//            in = new FileInputStream(trilhaDecorrente);
        
        audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    
    }   
       
    
}