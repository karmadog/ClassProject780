package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import Menu.MenuItem;
import Menu.NullMenuItem;
import data.Library;
import java.util.Scanner;
import utils.LibraryFileManager;

public class LibraryControl {

	private static LibraryControl instance;

	private LibraryFileManager fileManager;
	
	private Library library;
	private GetOptions options;
        
	
	private LibraryControl() {
        fileManager = LibraryFileManager.getInstance();
        library = Library.getInstanceFromSaveFile();
        options = GetOptions.getInstance();
    }

    public static LibraryControl getInstance(){
    	if(instance == null)
    		instance = new LibraryControl();
    	return instance;
    }

    public void controlLoop() {
        MenuItem currentMenuItem = new NullMenuItem();
        while (currentMenuItem.getIndex() != 0){
            try {
                printOptions();
                currentMenuItem = getMenuItem();
                currentMenuItem.OnSelected();
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect data entered, no publication added."+exception);
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("The selected option does not exist, select again:");
            }
        }

    }
	
	private void printOptions() {
        System.out.println("Select an option:  ");
        options.printOptions();
    }
        
    public int getInt() throws NumberFormatException {
        
            Scanner scanner;
            scanner = new Scanner(System.in);
        
            int number = 0;
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException exception) {
                throw new NumberFormatException("Number entered in incorrect form"+exception);
            } finally {
                scanner.nextLine();
            }
            return number;
        }
    
    public MenuItem getMenuItem() throws NoSuchElementException{
		   MenuItem result = null;
		   try {
               result = GetOptions.getInstance().getMenuItemAt(getInt());
           } catch(ArrayIndexOutOfBoundsException exception) {
               throw new NoSuchElementException("No element specified ID"+exception);
           }
		   return result;
	    }
    
    
}
