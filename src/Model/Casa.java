/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author paabl
 */
public class Casa {
    
    private final ArrayList peoes;
    private final ArrayList peças;
    private boolean ocupada;
    
    public Casa(){
        peoes = new ArrayList<JLabel>();
        peças = new ArrayList<Peça>();
    }
      
    public void addPeao(JLabel peao,Peça p){
        peoes.add(peao);
        peças.add(p);
        
        ocupada = true;
    }
    
    public void removePeao(JLabel peao){
        int i = peoes.indexOf(peao);
        peoes.remove(peao);
        peças.remove(i);
        
        if(peças.size() == 0)
            ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    
    
    

}
