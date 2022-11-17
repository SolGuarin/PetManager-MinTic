/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Usuario
 */
public class cslCat extends cslPet {
    private String breed;

    public cslCat(String breed, String code, String name, int bornYear, String color, String healthStatus) {
        super(code, name, bornYear, color, healthStatus);
        this.breed = breed;
    }
    
    
    
    public void selfCleaning(){
        System.out.println("El gato" + super.getName() + "se está limpiando");
    }
    
    @Override
    public void Sound(){
        System.out.println("El gato " + super.getName() + " hace miauuuuu ");
    }
    
    @Override
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
        return " Gato ";
    }
           
           
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
