package LibraryActions;

import data.BookFactory;
import utils.DataReader;

public class AddBookBehaviour extends AddPublicationBehaviour {
        public BookFactory factory;
        
	public AddBookBehaviour() {
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
        void getDataReader(){
            dataReader = DataReader.getInstance();
        }
        
        @Override
        public void addToLibrary(){
             library.addPublication(factory.getPublication(parameters));
        }
}
