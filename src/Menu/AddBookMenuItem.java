package Menu;

import LibraryActions.AddBookBehaviourUser;


public class AddBookMenuItem extends MenuItem {

	public AddBookMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddBookBehaviourUser();
	}

}
