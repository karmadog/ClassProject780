/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import static View.InventoryDisplay.printPublications;
import data.Article;
import data.Library;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.PrintStream;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author karma
 */
public class UserDisplay extends InventoryDisplay{

    
    public UserDisplay(Library library){
        
        JTextArea viewItems;
        
        viewItems = new JTextArea();
        PrintStream printStream = new PrintStream(new InventoryDisplay.CustomOutputStream(viewItems));
        System.setOut(printStream);
        System.setErr(printStream);
        viewItems.setEditable(false);
        
        printUsers(library);
        
        JScrollPane scrollPane = new JScrollPane(viewItems, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);

        add(scrollPane);
        
        setVisible(true);
        
    }
    

    
   
    
}
