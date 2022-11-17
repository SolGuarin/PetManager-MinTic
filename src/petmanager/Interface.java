/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.cslCat;
import Classes.cslDog;

/**
 *
 * @author Usuario
 */
public class Interface {
    public static void main(String[] args) {
                // Instancias de las clases hijas 
        cslDog dog = new cslDog("Criollo", false, "001", "Firulais", 2013, "Negro", "sano");
        cslCat cat = new cslCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        System.out.println(dog.getAnimalType());
        System.out.println("" + cat.getAnimalType());
        
        System.out.println(dog.getNumberOfBones());
        System.out.println(cat.getNumberOfBones()); 
                
                
    }
    
}
