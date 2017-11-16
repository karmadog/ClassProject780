package LibraryActions;

import data.PeriodicalFactory;


public class AddPeriodicalbehaviour extends AddPublicationBehaviour {
    public PeriodicalFactory factory;

            
	public AddPeriodicalbehaviour() {
		super();
	}
        
    @Override
        void getFactory(){
            factory = new PeriodicalFactory();
        }
        
    @Override
        void getParameters(){
            parameters = dataReader.getUserInputPeriodical();
        }
            
    /**
     *
     */
    @Override
        public void addToLibrary(){
             library.addPublication(factory.getPublication(parameters));
        }  
    
}
