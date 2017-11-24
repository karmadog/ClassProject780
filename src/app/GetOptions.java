/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import Menu.AddBookMenuItem;
import Menu.AddFileMenuItem;
import Menu.AddPeriodicalMenuItem;
import Menu.AddUserMenuItem;
import Menu.ExitMenuItem;
import Menu.MenuItem;
import Menu.PrintBookMenuItem;
import Menu.PrintPeriodicalMenuItem;
import Menu.PrintUserMenuItem;
import Menu.PrintArticleMenuItem;

/**
 *
 * @author Nimisha
 */
public class GetOptions {
	
	private static GetOptions instance;
	
	private static ArrayList<MenuItem> menuItems = new ArrayList<>();
	
	public static GetOptions getInstance(){
		if(instance == null)
			instance = new GetOptions();
		return instance;
	}
	
	private GetOptions(){
		menuItems.add(new ExitMenuItem(0, "Exit program"));
		menuItems.add(new AddBookMenuItem(1, "Add a book"));
		menuItems.add(new AddPeriodicalMenuItem(2, "Add a magazine / newspaper"));
		menuItems.add(new PrintBookMenuItem(3, "View available books"));
		menuItems.add(new PrintPeriodicalMenuItem(4, "View available magazines / newspapers"));
                menuItems.add(new PrintArticleMenuItem(5, "View of available articles"));
		menuItems.add(new AddUserMenuItem(6, "Add a new user"));
		menuItems.add(new PrintUserMenuItem(7, "View the list of users"));
                menuItems.add(new AddFileMenuItem(8, "Read file as inventory input"));
	}
    
     public MenuItem getMenuItemAt(int index){
    	 return menuItems.get(index);
     }
     
     public void printOptions(){
    	 for(int i=0;i<menuItems.size();i++){
    		 System.out.println(menuItems.get(i).getIndex() + " - " + menuItems.get(i).getDescription());
    	 }
     }
     
     
}
