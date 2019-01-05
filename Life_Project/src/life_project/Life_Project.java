/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life_project;

import javax.swing.JFrame;

/**
 *
 * @author Marker
 */
public class Life_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame f = new JFrame();
       f.setSize(500, 500);
       f.add(new GUI());
       f.setVisible(true);
        
        
    }
    
}
