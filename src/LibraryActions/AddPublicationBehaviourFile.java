package LibraryActions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.FileInputReader;

public class AddPublicationBehaviourFile extends LibraryBehaviour {

    public FileInputReader dataReader;
     
    public AddPublicationBehaviourFile(){
    }
    
    @Override
    public final void execute() {
        dataReader = FileInputReader.getInstance();
        try {
            dataReader.addFile();
        } catch (IOException ex) {
            Logger.getLogger(AddPublicationBehaviourFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
