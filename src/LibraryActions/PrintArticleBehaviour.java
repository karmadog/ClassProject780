package LibraryActions;

import View.ArticleDisplay;


public class PrintArticleBehaviour extends LibraryBehaviour {

	public PrintArticleBehaviour() {
		super();
	}

	@Override
	public void execute() {
		ArticleDisplay articleDisplay = new ArticleDisplay(library);
	}

}
