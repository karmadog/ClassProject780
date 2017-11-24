package Menu;

import LibraryActions.PrintArticleBehaviour;

public class PrintArticleMenuItem extends MenuItem {

	public PrintArticleMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new PrintArticleBehaviour();
	}

}
