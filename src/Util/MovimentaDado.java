/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import static Util.EnumDado.Primeiro;
import static Util.EnumDado.Segundo;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author paabl
 */
public class MovimentaDado{

    private final JToggleButton button1;
    private final JToggleButton button2;
    private final ImageIcon[] framesDado;
    private Timer Dado1;
    private Timer Dado2;
    private DadoTimerTask d1;
    private DadoTimerTask d2;
    private boolean RunningDado1;
    private boolean RunningDado2;
    private boolean RunningDadoAmbos;

    public boolean isRunning(EnumDado dado) {
        if(dado == Primeiro)
            return RunningDado1;
        else if(dado == Segundo)
            return RunningDado2;
        else
            return RunningDadoAmbos;
            
    }


    public MovimentaDado(JToggleButton button1, JToggleButton button2 ,ImageIcon[] framesDado){
        this.button1 = button1;
        this.button2 = button2;
        this.framesDado = framesDado;

    }
    

    public void start(long tempoLimite, EnumDado dado){
        
        if(dado == Primeiro){
            RunningDado1 = true;
            this.Dado1 = new Timer();
            Dado1.schedule(d1 = new DadoTimerTask(button1,framesDado,Primeiro,tempoLimite),0,5000);
        }
        else if(dado == Segundo){
            this.Dado2 = new Timer();
            RunningDado2 = true;
            Dado2.schedule(d2 =new DadoTimerTask(button2,framesDado,Segundo,tempoLimite),0,5000);
        }
        else{
            this.Dado1 = new Timer();
            Dado1.schedule(d1 = new DadoTimerTask(button1,framesDado,Primeiro,tempoLimite),0,5000);
            this.Dado2 = new Timer();
            Dado2.schedule(d2 =new DadoTimerTask(button2,framesDado,Segundo,tempoLimite),0,5000);
        }
    
        this.RunningDadoAmbos = (RunningDado1 && RunningDado2);
    } 
    
     public void start(EnumDado dado){
        
        if(dado == Primeiro){
            this.Dado1 = new Timer();
            Dado1.schedule(d1 =  new DadoTimerTask(button1,framesDado,Primeiro),0,5000);
            RunningDado1 = true;
        }
        else if(dado == Segundo){
             this.Dado2 = new Timer();
            Dado2.schedule(d2 = new DadoTimerTask(button2,framesDado,Segundo),0,5000);
            RunningDado2 = true;
        }
        else{
            this.Dado1 = new Timer();
            Dado1.schedule(d1 =  new DadoTimerTask(button1,framesDado,Primeiro),0,5000);
            this.Dado2 = new Timer();
            Dado2.schedule(d2 = new DadoTimerTask(button2,framesDado,Segundo),0,5000);
        }
        
        this.RunningDadoAmbos = (RunningDado1 && RunningDado2);
        
    } 
    
    
    
     public void stop(EnumDado dado){
        
        if(dado == Primeiro){
             Dado1.cancel();
             d1.getTimerAnimateDado().stop();
             RunningDado1 = false;
        }
        else if (dado == Segundo){
             Dado2.cancel();
             d2.getTimerAnimateDado().stop();
             RunningDado2 = false;
        }
        else{
            Dado1.cancel();
            d1.getTimerAnimateDado().stop();
            Dado2.cancel();
            d2.getTimerAnimateDado().stop();
        }
        
        this.RunningDadoAmbos = (RunningDado1 && RunningDado2);
   
    } 
     
}
