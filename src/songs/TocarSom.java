/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songs;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    private static TocarSom tocarSom;

    private TocarSom(){
        //Os comandos abaixo servem para generalizar os diretorios dos arquivos de musica
        click = System.getProperty("user.dir")+"\\src\\songs\\click.wav";
      
        
        jogandoDados = System.getProperty("user.dir")+"\\src\\songs\\jogando_dados.wav";
      
        
        movendoPinos = System.getProperty("user.dir")+"\\src\\songs\\movendo_pino.wav";
       
        
        trilhaDecorrente = System.getProperty("user.dir")+"\\src\\songs\\trilha_decorrente.wav";
    }
    
        
    public static void tocaSom(String nome) throws IOException{
        if(tocarSom == null)
            tocarSom = new TocarSom();
        
        if(nome.equals("click"))
            in = new FileInputStream(click);
        else if(nome.equals("jogando_dados"))
            in = new FileInputStream(jogandoDados);
        else if(nome.equals("movendo_pino"))
            in = new FileInputStream(movendoPinos);
        else
            in = new FileInputStream(trilhaDecorrente);
        
        audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    
    }   
       
    
}