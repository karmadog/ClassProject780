package Menu;

import LibraryActions.AddBookBehaviour;


public class AddBookMenuItem extends MenuItem {

	public AddBookMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddBookBehaviour();
	}

}
