package Menu;

import LibraryActions.LibraryBehaviour;
import java.util.Scanner;

public abstract class MenuItem {
	
	protected int index;
	protected String description;
	protected LibraryBehaviour myBehaviour;
        private final Scanner scanner;
	
	public MenuItem(int index, String description) {
		super();
		this.index = index;
		this.description = description;
                scanner = new Scanner(System.in);
	}

	public void OnSelected(){
		myBehaviour.execute();
	}

	public int getIndex() {
		return index;
	}

	public String getDescription() {
		return description;
	}

    

}
