/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Patient {
    Patient patientListStart = null;
    private String name;
    private int age;
    private Patient nextPatient;
    
    public Patient(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void addPatient(Patient newPatient){
        if (this.nextPatient == null){
            this.nextPatient = newPatient;
        }
        else {
            this.nextPatient.addPatient(newPatient);
        }
    }
    
    public void deletePatient(String patientToDelete){
        if (this.nextPatient.name.equals(patientToDelete)){
            Patient toRelease = this.nextPatient;
            this.nextPatient = nextPatient.nextPatient;
            toRelease = null;
        } else this.nextPatient.deletePatient(patientToDelete);
    }
    
    public static void main(String[] args){
         
    }
    
    public void launch(){

    }
}
