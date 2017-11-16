package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.LibraryUser;
import data.InputData;


public class UserInputReader {

	private static UserInputReader instance;
	
	private final Scanner scanner;
        
        
	private UserInputReader(){
		scanner = new Scanner(System.in);
	}
	
	public static UserInputReader getInstance(){
		if(instance == null)
			instance = new UserInputReader();
		return instance;
	}
	
	public void close(){
		scanner.close();
	}
	
	
	
	public InputData getUserInputBook() throws InputMismatchException {
            InputData parameters = new InputData();
            System.out.println("Title: ");
            parameters.title = scanner.nextLine();
            System.out.println("Author: ");
            parameters.author = scanner.nextLine();
            System.out.println("Publishing house: ");
            parameters.publisher = scanner.nextLine();
            System.out.println("ISBN: ");
            parameters.isbn = scanner.nextLine();
            System.out.println("Publication year: ");
            try {
                parameters.year = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Number of pages: ");
                parameters.pages = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                throw exception;
            }
 
            return parameters;
        }
	
	public InputData getUserInputPeriodical() throws InputMismatchException {
            InputData parameters = new InputData();
        System.out.println("Title: ");
        parameters.title = scanner.nextLine();
        System.out.println("Publishing house: ");
        parameters.publisher = scanner.nextLine();
        System.out.println("Language: ");
        parameters.language = scanner.nextLine();
        System.out.println("Publication year: ");
        parameters.year = 0;
        parameters.month = 0;
        parameters.day = 0;
        try {
            parameters.year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Publication Month: ");
            parameters.month = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Publication Day: ");
            parameters.day = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException exception) {
            scanner.nextLine();
            throw exception;
        }
 
        return parameters;
    }
	
	public LibraryUser readAndCreateLibraryUser() {
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Social Security Number, ######### format: ");
        String socialSecurityNumber = scanner.nextLine();
  
        return new LibraryUser(firstName, lastName, socialSecurityNumber);
    }
	
	   
}
