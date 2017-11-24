package LibraryActions;

import Factories.BookFactory;

public class AddBookBehaviourUser extends AddPublicationBehaviourUser {
    
    public BookFactory factory;
        
    public AddBookBehaviourUser() {
	super();
    }
          
    @Override
    void getFactory(){
        factory = new BookFactory();
    }
        
    @Override
    void getParameters(){
        parameters = dataReader.getUserInputBook();
    }
    
    @Override
    public void addToLibrary(){
        library.addPublication(factory.getPublication(parameters));
    }
}
