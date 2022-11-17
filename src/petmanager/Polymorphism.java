/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.cslCat;
import Classes.cslDoctor;
import Classes.cslDog;
import Classes.cslVeterinary;

/**
 *
 * @author Usuario
 */
public class Polymorphism {
    public static void main(String[] args) {
        
        // Instancias de las clases hijas 
        cslDog dog = new cslDog("Criollo", false, "001", "Firulais", 2013, "Negro", "sano");
        cslCat cat = new cslCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        // Instancias de veterinary y doctor 
        cslDoctor doctor = new cslDoctor("Soleny Guarín", "12345");
        cslVeterinary veterinary = new cslVeterinary("Veterinaria mi compañero fiel", "614 40 11", "Cra Junin # 20-22", doctor);
        
        String careDog = veterinary.petCare(dog);
        System.out.println("El estado de salud de " + dog.getName() + " es " + careDog);
        
        String careCat = veterinary.petCare(cat);
        System.out.println("El estado de salud de " + cat.getName() + " es " + careCat);
    }
    
}
