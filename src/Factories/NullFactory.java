/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import data.InputData;
import data.NullPublication;
import data.Publication;

/**
 *
 * @author karmadog
 */
public class NullFactory extends PublicationFactory {
    
    boolean isNull(){
        return true;
    }
    
    @Override
    public Publication getPublication(InputData parameters){
        return new NullPublication(parameters);
    }
    
}
