package LibraryActions;

import Factories.ArticleFactory;

public class AddArticleBehaviourUser extends AddPublicationBehaviourUser {
    
    public ArticleFactory factory;
        
    public AddArticleBehaviourUser() {
	super();
    }
          
    @Override
    void getFactory(){
        factory = new ArticleFactory();
    }
        
    @Override
    void getParameters(){
        parameters = userInputReader.getUserInputArticle();
    }
    
    @Override
    public void addToLibrary(){
        library.addPublication(factory.getPublication(parameters));
    }
}
