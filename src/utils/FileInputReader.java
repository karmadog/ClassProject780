package utils;

import Factories.BookFactory;
import java.util.InputMismatchException;
import java.util.Scanner;

import data.InputData;
import data.Library;
import Factories.PeriodicalFactory;
import Factories.ArticleFactory;
import Factories.NullFactory;
import Factories.PublicationFactory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileInputReader {

	private static FileInputReader instance;
	private InputData parameters;
	private final Scanner scanner;
        private Library library;
        private BufferedReader reader;

        
	private FileInputReader(){
		scanner = new Scanner(System.in);
                library = Library.getInstance();
                parameters = new InputData();

	}
	
	public static FileInputReader getInstance(){
		if(instance == null)
			instance = new FileInputReader();
		return instance;
	}
	
	public void close(){
		scanner.close();
	}
	
        
        public void addFile() throws FileNotFoundException, IOException{
            
            String fileName, line;
            
            System.out.println("Enter file name: ");
            fileName = scanner.nextLine();
            
            reader = new BufferedReader(new FileReader(fileName));
            
            
            while((line = reader.readLine())!= null){
                
                String publicationType = line;
                PublicationFactory factory;
            
                if(publicationType.equalsIgnoreCase("book")){
                    getFileInputBook();
                    factory = new BookFactory();  
                }
                if(publicationType.equalsIgnoreCase("periodical")){
                    getFileInputPeriodical();
                    factory = new PeriodicalFactory();
                }
                if(publicationType.equalsIgnoreCase("article")){
                    getFileInputArticle();
                    factory = new ArticleFactory();
                }
                factory = new NullFactory();
                
		library.addPublication(factory.getPublication(parameters));
            }
        }
	
	private void getFileInputBook() throws InputMismatchException, IOException {
            
            String line;
            parameters.year = 0;
            
            line = reader.readLine();
            parameters.title = line;
            line = reader.readLine();
            parameters.author = line;
            line = reader.readLine();
            parameters.publisher = line;
            line = reader.readLine();
            parameters.isbn = line;
            line = reader.readLine();
            try{
                parameters.year = Integer.parseInt(line.trim());
            } catch (InputMismatchException exception) {
            throw exception;
            }
            line = reader.readLine();
            parameters.pages = line;
        }
	
	private void getFileInputPeriodical() throws InputMismatchException, IOException {
            
            String line;
            
            line = reader.readLine();
            parameters.title = line;
            line = reader.readLine();
            parameters.publisher = line;
            line = reader.readLine();
            parameters.language = line;
            line = reader.readLine();
            parameters.year = 0;
            parameters.month = 01;
            parameters.day = 0;
            try {
                parameters.year = Integer.parseInt(line.trim());
                line = reader.readLine();
                parameters.month = Integer.parseInt(line.trim());
                line = reader.readLine();
                parameters.day = Integer.parseInt(line.trim());
            } catch (InputMismatchException exception) {
            throw exception;
            }
        }
        
        private void getFileInputArticle() throws InputMismatchException, IOException {
            
            String line;

            parameters.year = 0;
            parameters.volume = 0;
            
            line = reader.readLine();
            parameters.author = line;
            line = reader.readLine();
            parameters.title = line;
            line = reader.readLine();
            parameters.journal = line;
            line = reader.readLine();
            try {
                parameters.volume = Integer.parseInt(line.trim());
                line = reader.readLine();
                parameters.year = Integer.parseInt(line.trim());
            } catch (InputMismatchException exception) {
            throw exception;
            }
            line = reader.readLine();
            parameters.pages = line;
        }
}
