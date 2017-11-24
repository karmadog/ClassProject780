package Menu;

import LibraryActions.AddPeriodicalBehaviourUser;


public class AddPeriodicalMenuItem extends MenuItem {

	public AddPeriodicalMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddPeriodicalBehaviourUser();
	}

}
