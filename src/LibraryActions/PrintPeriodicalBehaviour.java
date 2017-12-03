package LibraryActions;

import View.PeriodicalDisplay;

public class PrintPeriodicalBehaviour extends LibraryBehaviour {

	public PrintPeriodicalBehaviour() {
		super();
	}

	@Override
	public void execute() {
		PeriodicalDisplay periodicalDisplay = new PeriodicalDisplay(library);
	}

}
