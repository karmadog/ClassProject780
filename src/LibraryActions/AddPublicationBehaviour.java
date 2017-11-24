package LibraryActions;

import data.InputData;
import utils.DataReader;

public abstract class AddPublicationBehaviour extends LibraryBehaviour {
	
    public InputData parameters;
    public DataReader dataReader;

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
        
    abstract void getDataReader();
         
    abstract void getFactory();
        
    abstract void getParameters();
        
    abstract void addToLibrary();
}
