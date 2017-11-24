package LibraryActions;

import utils.LibraryUtils;

public class PrintArticleBehaviour extends LibraryBehaviour {

	public PrintArticleBehaviour() {
		super();
	}

	@Override
	public void execute() {
		LibraryUtils.printArticles(library);
	}

}
