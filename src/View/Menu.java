/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import LibraryActions.LibraryBehaviour;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author karma
 */
public abstract class Menu extends JFrame{
    
    protected LibraryBehaviour myBehaviour;
    
    
    
    public Menu(){
        
        setTitle("Library System version-2.0");
        
        
        
    }

    protected class ViewHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        }
    }

    protected class AddHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        }
    }

    protected class ManageHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        }
    }

    protected class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        }
    }
    
}
