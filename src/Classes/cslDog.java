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
public class cslDog extends cslPet {
    private String breed;
    private boolean pedigree;

    public cslDog(String breed, boolean pedigree, String code, String name, int bornYear, String color, String healthStatus) {
        super(code, name, bornYear, color, healthStatus);
        this.breed = breed;
        this.pedigree = pedigree;
    }
    
    
    public void WalkAround(){
        System.out.println("El perro" + super.getName() + "está caminando.");
    }
    
    public void WalkAround(int km){ 
        System.out.println("El perro " + super.getName() + " está caminado " + km + " km");
    }
    
    public void WalkAround(boolean dogLeash){ 
        String hasLeash = dogLeash ? "con correa" : "sin correa";
        System.out.println("El perro " + super.getName() + " está caminado " + hasLeash);
    }
    
    @Override
    public void Sound(){
        System.out.println("El perro " + super.getName() + " hace guauuuuu ");
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
