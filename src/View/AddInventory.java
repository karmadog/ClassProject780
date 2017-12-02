/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import LibraryActions.AddArticleBehaviourUser;
import LibraryActions.AddBookBehaviourUser;
import LibraryActions.AddPeriodicalBehaviourUser;
import LibraryActions.AddPublicationBehaviourFile;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author karma
 */
public class AddInventory extends Menu {
    
    private final JButton book, article, periodical, file, exit;
    
    private final BookHandler bookHandler;
    private final ArticlHandler articleHandler;
    private final PeriodicalHandler periodicalHandler;
    private final FileHandler fileHandler;
    private final ExitHandler exitHandler;
    
    public AddInventory(){
        
        book = new JButton("ADD A BOOK TO INVENTORY");
        bookHandler = new BookHandler();
        book.addActionListener(bookHandler);
        
        article = new JButton("ADD AN ARTICLE TO INVENTORY");
        articleHandler = new ArticlHandler();
        article.addActionListener(articleHandler);
        
        periodical = new JButton("ADD A PERIODICAL TO INVENTORY");
        periodicalHandler = new PeriodicalHandler();
        periodical.addActionListener(periodicalHandler);
        
        file = new JButton("ADD AN INVENTORY FILE");
        fileHandler = new FileHandler();
        file.addActionListener(fileHandler);
        
        exit = new JButton("RETURN TO MAIN MENU");
        exitHandler = new ExitHandler();
        exit.addActionListener(exitHandler);
        
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5,1));
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        
        add(book);
        add(article);
        add(periodical);
        add(file);
        add(exit);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    private class BookHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            myBehaviour = new AddBookBehaviourUser();
            myBehaviour.execute();
        }
    }

    private class ArticlHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            myBehaviour = new AddArticleBehaviourUser();
            myBehaviour.execute();
        }
    }

    private class PeriodicalHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            myBehaviour = new AddPeriodicalBehaviourUser();
            myBehaviour.execute();
        }
    }
    
    private class FileHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            myBehaviour = new AddPublicationBehaviourFile();
            myBehaviour.execute();
        }
    }

    private class ExitHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            dispose();
      
        }
    }
}
