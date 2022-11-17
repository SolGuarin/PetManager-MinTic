/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.cslDoctor;
import Classes.cslVeterinary;

/**
 *
 * @author Usuario
 */
public class abstracClass {
    public static void main(String[] args) {
        cslDoctor doctor = new cslDoctor("Soleny Guarín", "12345");
        cslVeterinary veterinary = new cslVeterinary("Veterinaria mi compañero fiel", "614 40 11", "Cra Junin # 20-22", doctor);
        
        veterinary.setData(veterinary.getName() + " - " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);
    }
    
    
}
