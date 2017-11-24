/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import data.InputData;
import data.Periodical;
import data.Publication;

/**
 *
 * @author karmadog
 */
public class PeriodicalFactory extends PublicationFactory{
    
    @Override
    public Publication getPublication(InputData parameters){
        return new Periodical(parameters);
    }
    
}
