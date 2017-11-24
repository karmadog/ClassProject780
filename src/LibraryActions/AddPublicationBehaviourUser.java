package LibraryActions;

import utils.UserInputReader;

public abstract class AddPublicationBehaviourUser extends AddPublicationBehaviour {

    public UserInputReader dataReader;
     
    public AddPublicationBehaviourUser(){
        super();	
    }
        
    @Override
    void getDataReader(){
        dataReader = UserInputReader.getInstance();
    }
    
    @Override
    abstract void getFactory();
        
    @Override
    abstract void getParameters();
        
    @Override
    abstract void addToLibrary();
}
