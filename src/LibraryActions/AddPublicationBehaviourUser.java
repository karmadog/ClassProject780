package LibraryActions;

import data.InputData;
import utils.UserInputReader;

public abstract class AddPublicationBehaviourUser extends LibraryBehaviour {

    public UserInputReader userInputReader;
    public InputData parameters;
     
    public AddPublicationBehaviourUser(){
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
        userInputReader = UserInputReader.getInstance();
    }
    
    abstract void getFactory();
        
    abstract void getParameters();
        
    abstract void addToLibrary();
}
