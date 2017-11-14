/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.User;

/**
 *
 * @author paabl
 */
public class TabuleiroControl {
    
    public User u ;

    public TabuleiroControl() {
        u = new User();
    }
    
    public void jogar(){
        u.jogar();
    }
    
    
}
