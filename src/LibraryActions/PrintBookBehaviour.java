package LibraryActions;

import View.BookDisplay;

public class PrintBookBehaviour extends LibraryBehaviour {

	public PrintBookBehaviour() {
		super();
	}

	@Override
	public void execute() {
		BookDisplay bookDisplay = new BookDisplay(library);
	}

}
