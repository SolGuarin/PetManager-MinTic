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
public abstract class AbstHospital {

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    private String data;
    
    public abstract String getPatientType();
    public abstract String Surgery();
    
    public String getHospitalInformation(){
        return "La información es: " + this.getData();
    }
}
