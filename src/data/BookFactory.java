/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author karmadog
 */
public class BookFactory extends PublicationFactory {
    

    @Override
    public Publication getPublication(InputData parameters){
        return new Book(parameters);
    }
    
}
