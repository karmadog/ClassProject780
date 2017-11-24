package LibraryActions;

import data.PeriodicalFactory;
import utils.DataReader;


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
        
    @Override
        void getDataReader(){
            dataReader = DataReader.getInstance();
        }
            
    /**
     *
     */
    @Override
        public void addToLibrary(){
             library.addPublication(factory.getPublication(parameters));
        }  
    
}
