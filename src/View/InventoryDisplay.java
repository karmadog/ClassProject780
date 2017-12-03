/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import data.AlphabeticalComparator;
import data.Library;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;

/**
 *
 * @author karma
 */
public abstract class InventoryDisplay extends Menu{

    
    protected static void printPublications(Library library, Class<?> cl) {
    	long countPublications = library.getPublications().values().stream()
    			.filter(cl::isInstance).sorted(new AlphabeticalComparator())
    			.peek(System.out::println).count();
    	if(countPublications == 0) {
    		System.out.println("No type publication was found in the library: " + cl.getSimpleName());
    	}
    }
    
    protected static void printUsers(Library library) {
    	library.getUsers().values().stream()
    	.sorted((a,b) -> a.getLastName().compareTo(b.getLastName()))
    	.forEach(System.out::println);
    }
    
     /**
 * This class extends from OutputStream to redirect output to a JTextArrea
 * @author www.codejava.net
 *
 */
    protected class CustomOutputStream extends OutputStream {
        private final JTextArea textArea;
     
        public CustomOutputStream(JTextArea textArea) {
         this.textArea = textArea;
        }
     
        @Override
        public void write(int b) throws IOException {
        // redirects data to the text area
            textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
    
    
    
}
