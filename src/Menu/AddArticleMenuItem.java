package Menu;

import LibraryActions.AddArticleBehaviourUser;


public class AddArticleMenuItem extends MenuItem {

	public AddArticleMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddArticleBehaviourUser();
	}

}
