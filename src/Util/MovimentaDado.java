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
    private boolean Running;

    public boolean isRunning() {
        return Running;
    }


    public MovimentaDado(JToggleButton button1, JToggleButton button2 ,ImageIcon[] framesDado){
        this.button1 = button1;
        this.button2 = button2;
        this.framesDado = framesDado;

    }
    

    public void start(long tempoLimite, EnumDado dado){
        
        if(dado == Primeiro){
            Running = true;
            this.Dado1 = new Timer();
            Dado1.schedule(d1 = new DadoTimerTask(button1,framesDado,Primeiro,tempoLimite),0,5000);
        }
        else{
            this.Dado2 = new Timer();
             Running = true;
            Dado2.schedule(d2 =new DadoTimerTask(button2,framesDado,Segundo,tempoLimite),0,5000);
        }
        
        
    } 
    
     public void start(EnumDado dado){
        
        if(dado == Primeiro){
            this.Dado1 = new Timer();
            Dado1.schedule(d1 =  new DadoTimerTask(button1,framesDado,Primeiro),0,5000);
            Running = true;
        }
        else{
             this.Dado2 = new Timer();
            Dado2.schedule(d2 = new DadoTimerTask(button2,framesDado,Segundo),0,5000);
            Running = true;
        }
        
        
    } 
    
    
    
     public void stop(EnumDado dado){
        
        if(dado == Primeiro){
             Dado1.cancel();
             d1.getTimerAnimateDado().stop();
             Running = false;
        }
        else{
             Dado2.cancel();
             d2.getTimerAnimateDado().stop();
             Running = false;
        }
        
        
    } 
     
}
