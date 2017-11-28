/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;

/**
 *
 * @author paabl
 */
public class PeçaAmarela extends Peça{
    
    
    public PeçaAmarela(int casaAtual){
        super.casaAtual = casaAtual;
        naBase = false;
        preencheCaminho();
    }

    public PeçaAmarela() {
        preencheCaminho();
        naBase = true;
    }

 
    @Override
    protected final void preencheCaminho() {
        caminho = new Point[]{
            //Próxima linha representa o trajeto 1 do verde
            new Point(560,580),new Point(560,555),new Point(560,520),new Point(560,485),new Point(560,450), new Point(560,415),new Point(560,380),
             //Próxima linha representa o trajeto 11 do verde
            new Point(530,345),new Point(495,345),new Point(460,345),new Point(425,345),new Point(390,345),new Point(355,345),new Point(320,345),new Point(285,345),
            //Próxima linha representa o trajeto 12 do verde
            new Point(285,310),new Point(285,275),new Point(320,270),new Point(355,270),new Point(390,270),new Point(425,270),new Point(460,270),new Point(495,270),new Point(530,270),
            //Próxima linha representa o trajeto 2 do verde
            new Point(565,235),new Point(565,200),new Point(565,165),new Point(565,130),new Point(565,95),new Point(565,60),new Point(565,25),new Point(565,0),
            //Próxima linha representa o trajeto 3 do verde
            new Point(600,0),new Point(635,0),
            //Próxima linha representa o trajeto 4 do verde
            new Point(635,25),new Point(635,60),new Point(635,95),new Point(635,130),new Point(635,165),new Point(635,200),new Point(635,235),
            //Próxima linha representa o trajeto 5 do verde
            new Point(670,270),new Point(700,270),new Point(730,270),new Point(765,270),new Point(800,270),new Point(835,270),new Point(870,270),new Point(905,270),
            //Próxima linha representa o trajeto 6 do verde
            new Point(905,305),new Point(905,340),
            //Próxima linha representa o trajeto 7 do verde
            new Point(870,340),new Point(835,340),new Point(800,340),new Point(770,340),new Point(735,340),new Point(700,340),new Point(665,340),
            //Próxima linha representa o trajeto 8 do verde
            new Point(630,375),new Point(630,405),new Point(630,440),new Point(630,475),new Point(630,510),new Point(630,545),new Point(630,580),new Point(630,615),
            //Próxima linha representa o trajeto 9 do verde
            new Point(595,615),new Point(595,580),new Point(595,545),new Point(595,510),new Point(595,475),new Point(595,440),new Point(595,405),new Point(595,370), new Point(595,335)
        
        };
    }

 
   
}
