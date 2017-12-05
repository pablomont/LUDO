/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author paabl
 */
public class MovimentaDado{

    private static boolean Running;
    private final JButton button1;
    private final ImageIcon[] framesDado;
    private final Timer dadoTimer;
    private static DadoTimerTask dadoTimerTask;

    public static boolean isRunning() {
        return Running;
    }

    public MovimentaDado(JButton button1,ImageIcon[] framesDado){
        this.dadoTimer = new Timer();
        this.button1 = button1;
        this.framesDado = framesDado;
    }
    

    public void start(long tempoLimite){
        Running = true;
        dadoTimer.schedule(dadoTimerTask = new DadoTimerTask(button1,framesDado,tempoLimite),0,1000);

    } 
    
     public void start(){
        Running = true; 
        dadoTimer.schedule(dadoTimerTask =  new DadoTimerTask(button1,framesDado),0,1000);

    } 
    
     public static void stopTimerTask(){
         Running = false;
         dadoTimerTask.getTimerAnimateDado().stop();
         dadoTimerTask.cancel();
         
     }
   
}
