/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author paabl
 */
public class Casa {
    
    public Casa(Point position) {
        this.position = position;
        ocupada = false;
    }
    
    public Casa(JLabel peao){
        this.position = peao.getLocation();
        this.peao = peao;
        ocupada = true;
    }
    
    private Peça peça;
    private Point position;
    private JLabel peao;
    private boolean ocupada;

}
