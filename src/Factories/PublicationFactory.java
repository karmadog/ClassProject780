/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import data.InputData;
import data.Publication;

/**
 *
 * @author karmadog
 */
public abstract class PublicationFactory {
    public abstract Publication getPublication(InputData parameters);
}
