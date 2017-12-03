/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import LibraryActions.LibraryBehaviour;
import data.Library;
import data.LibraryUser;
import javax.swing.JFrame;

/**
 *
 * @author karma
 */
public abstract class Menu extends JFrame{
    
    protected LibraryBehaviour myBehaviour;
    protected Library library;
    protected LibraryUser libraryUser;

    public Menu(){
        
        setTitle("Library System version-2.0");
 
    }
    
}
