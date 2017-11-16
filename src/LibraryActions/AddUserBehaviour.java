package LibraryActions;

import data.LibraryUser;
import utils.UserInputReader;

public class AddUserBehaviour extends LibraryBehaviour {
	
	private LibraryUser libraryUser;
	
	public AddUserBehaviour(){
		super();
	}

	@Override
	public void execute() {
		libraryUser = UserInputReader.getInstance().readAndCreateLibraryUser();
		library.addUser(libraryUser);
	}

}
