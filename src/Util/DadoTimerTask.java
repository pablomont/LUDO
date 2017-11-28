/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import static Util.EnumDado.Primeiro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.Timer;

import java.util.TimerTask;

/**
 *
 * @author paabl
 */
public class DadoTimerTask extends TimerTask  {
    
    private final JToggleButton button;
    private final ImageIcon[] framesDado;
    private final ActionListener animateDado;
    private final javax.swing.Timer timerAnimateDado;
    private long timeMillis;
    private long TempoLimite;
    private boolean TempoLimiteAtivado;

    public Timer getTimerAnimateDado() {
        return timerAnimateDado;
    }
    
    public DadoTimerTask(JToggleButton button,ImageIcon[] framesDado, EnumDado dado){
        this.TempoLimite = 0;
        TempoLimiteAtivado = false;
        this.timeMillis = 0;
        this.button = button;
        this.framesDado = framesDado;  
    
        if(dado == Primeiro){
            animateDado = new ActionListener() {
            int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index<framesDado.length-1) 
                    index++;
                else 
                    index = 0;
                button.setIcon(framesDado[index]);     
                }
            };        
        }
        else{
            animateDado = new ActionListener() {

            int index2 = framesDado.length-1;
            @Override
            public void actionPerformed(ActionEvent e) {

                if(index2 > 0)
                    index2--; 
                else 
                    index2 = framesDado.length-1;
                button.setIcon(framesDado[index2]);  
                }
            };

        }
         timerAnimateDado = new javax.swing.Timer(100,animateDado);
    }
    
    public DadoTimerTask(JToggleButton button,ImageIcon[] framesDado, EnumDado dado,long t){
        this.TempoLimite = t;
        TempoLimiteAtivado = true;
        this.timeMillis = System.currentTimeMillis();
        this.button = button;
        this.framesDado = framesDado;  
    
        if(dado == Primeiro){
            animateDado = new ActionListener() {
            int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index<framesDado.length-1) 
                    index++;
                else 
                    index = 0;
                button.setIcon(framesDado[index]);     
                }
            };        
        }
        else{
            animateDado = new ActionListener() {

            int index2 = framesDado.length-1;
            @Override
            public void actionPerformed(ActionEvent e) {

                if(index2 > 0)
                    index2--; 
                else 
                    index2 = framesDado.length-1;
                button.setIcon(framesDado[index2]);  
                }
            };

        }
         timerAnimateDado = new javax.swing.Timer(100,animateDado);
    }
    

     @Override
     public void run() {
         
         timerAnimateDado.start();
         if(System.currentTimeMillis() > timeMillis + TempoLimite && TempoLimiteAtivado)
             timerAnimateDado.stop();
           
    }
}
