/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Patient1 {
      
    private String name;
    private int age;
    private Patient1 nextPatient ;
    
    public Patient1(String name, int age){
        this.name = name;
        this.age = age;
        this.nextPatient = null;
    }
    
    public void addPatient(Patient1 newPatient){
        if (this.nextPatient == null){
            this.nextPatient = newPatient;
        }
        else {
            this.nextPatient.addPatient(newPatient);
        }
    }
    
    public void deletePatient(String patientToDelete){
        if (this.nextPatient.name.equals(patientToDelete)){
            Patient1 toRelease = this.nextPatient;
            this.nextPatient = nextPatient.nextPatient;
            toRelease = null;
        } else this.nextPatient.deletePatient(patientToDelete);
    }
    
    

}
