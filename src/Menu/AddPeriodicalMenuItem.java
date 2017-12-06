package Menu;

import LibraryActions.AddPeriodicalBehaviour;


public class AddPeriodicalMenuItem extends MenuItem {

	public AddPeriodicalMenuItem(int index, String description) {
		super(index, description);
		myBehaviour = new AddPeriodicalBehaviour();
	}

}
