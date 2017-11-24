package Menu;

import LibraryActions.AddPublicationBehaviourFile;

public class AddFileMenuItem extends MenuItem {

	public AddFileMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddPublicationBehaviourFile();
	}

}
