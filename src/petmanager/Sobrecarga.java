/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;


/**
 *
 * @author Usuario
 */
public class Sobrecarga {
    public static void main(String[] args) {
        // Instancias de las clases hijas 
        cslDog dog = new cslDog("Criollo", false, "001", "Firulais", 2013, "Negro", "sano");
        
        dog.WalkAround();
        dog.WalkAround(5);
        dog.WalkAround(true);
        
    }
}
