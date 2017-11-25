package LibraryActions;

import Factories.PeriodicalFactory;

public class AddPeriodicalBehaviourUser extends AddPublicationBehaviourUser {
    
    public PeriodicalFactory factory;
          
    public AddPeriodicalBehaviourUser() {
	super();
    }
        
    @Override
    void getFactory(){
        factory = new PeriodicalFactory();
    }
        
    @Override
    void getParameters(){
        parameters = userInputReader.getUserInputPeriodical();
    }
            
    @Override
    public void addToLibrary(){
        library.addPublication(factory.getPublication(parameters));
    }  
    
}
