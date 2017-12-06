package Menu;

import LibraryActions.AddPeriodicalbehaviour;


public class AddPeriodicalMenuItem extends MenuItem {

	public AddPeriodicalMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddPeriodicalbehaviour();
	}

}
