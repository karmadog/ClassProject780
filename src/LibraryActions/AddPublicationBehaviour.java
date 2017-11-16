package LibraryActions;

import data.InputData;
import utils.UserInputReader;



public abstract class AddPublicationBehaviour extends LibraryBehaviour {
	
        public UserInputReader dataReader;
        public InputData parameters;

	public AddPublicationBehaviour(){
		super();
		
	}

        @Override
	public final void execute(){
            getDataReader();
            getFactory();
            getParameters();
            addToLibrary();
        }
        
       void getDataReader(){
            dataReader = UserInputReader.getInstance();
        }
        
        abstract void getFactory();
        
        abstract void getParameters();
        
        abstract void addToLibrary();
}
