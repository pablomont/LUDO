/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author paabl
 */


public class Tabuleiro {
    
   
   private static Tabuleiro tabuleiro;
   private static List<Point> casasSeguras = new ArrayList<Point>();
   private static List<Point> casasNaoSeguras = new ArrayList<Point>();

    public static boolean contains(Point location) {
      for(Point p : casasSeguras ){
          if(location.x == p.x && location.y == p.y){
              return true;
          } 
      }
      return false;
    }

  
    
    private Tabuleiro() {
        preencheCasasNaoSeguras();
    }

    private static java.util.List getCasasNaoSeguras() {
        if(tabuleiro == null)
                tabuleiro = new Tabuleiro();
        return casasNaoSeguras;
    }
    
    private void preencheCasasSeguras(){
        casasSeguras = new ArrayList<>(Arrays.asList(
                new Point(320,270),new Point(560,590),new Point(870,340),new Point(635,25),new Point(565,130),new Point(765,270),new Point(630,475),new Point(425,345)
        ));
    }

    public static java.util.List getCasasSeguras() {
        if(tabuleiro == null)
                tabuleiro = new Tabuleiro();
        return casasSeguras;
    }
    
    
    
    private void preencheCasasNaoSeguras() {
       casasNaoSeguras = new ArrayList<>(Arrays.asList(
               new Point(355,270),new Point(390,270),new Point(425,270),new Point(460,270),new Point(495,270),new Point(530,27),new Point(565,235),new Point(565,200),new Point(565,165),
               new Point(565,95),new Point(565,60),new Point(565,25),new Point(565,0),new Point(600,0),new Point(635,0),new Point(635,60),new Point(635,95),
               new Point(635,130),new Point(635,165),new Point(635,200),new Point(635,235),new Point(670,270),new Point(700,270),new Point(730,270),new Point(800,270),new Point(835,270),
               new Point(870,270),new Point(905,270),new Point(905,305),new Point(905,340),new Point(835,340),new Point(800,340),new Point(770,340),new Point(735,340),new Point(700,340),
               new Point(665,340),new Point(630,375),new Point(630,405),new Point(630,440),new Point(630,510),new Point(630,545),new Point(630,580),new Point(630,615),new Point(595,615),  
               new Point(560,615),new Point(560,580),new Point(560,555),new Point(560,520),new Point(560,485),new Point(560,450)
       ));
    } 
    
   
      
}
