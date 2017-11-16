package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.InputData;


public class FileInputReader {

	private static FileInputReader instance;
	
	private final Scanner scanner;
        
        
	private FileInputReader(){
		scanner = new Scanner(System.in);
	}
	
	public static FileInputReader getInstance(){
		if(instance == null)
			instance = new FileInputReader();
		return instance;
	}
	
	public void close(){
		scanner.close();
	}
	
	public int getInt() throws NumberFormatException {
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
	
	public InputData getFileInputBook() throws InputMismatchException {
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
	
	public InputData getFileInputPeriodical() throws InputMismatchException {
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
	
}