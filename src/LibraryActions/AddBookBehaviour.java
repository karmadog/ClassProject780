package LibraryActions;

import data.BookFactory;

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
        public void addToLibrary(){
             library.addPublication(factory.getPublication(parameters));
        }
}
