package LibraryActions;

import View.UserDisplay;

public class PrintUserBehaviour extends LibraryBehaviour {
	
	public PrintUserBehaviour() {
		super();
	}

	@Override
	public void execute() {
            UserDisplay userDisplay = new UserDisplay(library);
	}

}
