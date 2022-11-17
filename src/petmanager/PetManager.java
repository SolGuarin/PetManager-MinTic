/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import Classes.cslPet;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PetManager {
    public static void main(String[] args) {
        // TODO code application logic here
        
        cslDog dog1 = new cslDog("Criollo", false, "001", "Firulais", 2013, "Negro", "sano");
        
        cslCat cat1 = new cslCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        Date currentDate = new Date();
        int currentYear = currentDate.getYear();
        
        int agePet1 = currentYear - dog1.getBornYear();
        int agePet2 = currentYear - cat1.getBornYear();
        
        if(agePet1 > agePet2){
            System.out.println("La mascota " + dog1.getName()+ " es mayor que la mascota " + cat1.getName());
        }else{
            if(agePet2 > agePet1){
                System.out.println("La mascota " + cat1.getName()+ " es mayor que la mascota " + dog1.getName());
            }else{
                System.out.println("La mascota " + dog1.getName()+ " tiene la misma edad que la mascota " + cat1.getName());
            }
        }
           
        
        dog1.Eat();
        
        cat1.Eat();
        cat1.Move();
        cat1.Sound();
        
        dog1.WalkAround();
        cat1.selfCleaning();
        
    }
}

    
/**
public class PetManager {

    

    public static void main(String[] args) {
        // TODO code application logic here
        
        cslPet pet1 = new 
                
    }
    
}
*     */