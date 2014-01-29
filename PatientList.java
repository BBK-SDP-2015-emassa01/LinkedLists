/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class PatientList {
    Patient1 patientListStart = null;
    
    public static void main(String[] args){
        PatientList tester = new PatientList();
        tester.launch();
    }
    
    public void launch(){
         Patient1 newP = new Patient1("Esha", 27);
         patientListStart = newP;
         
         
         Patient1 newQ = new Patient1("Manoj", 27);
         

         Patient1 newR = new Patient1("Raju", 35);
         
         
         Patient1 newS = new Patient1("Mum", 60);
         
         
         Patient1 newT = new Patient1("Dad", 65);
         
         
         //patientListStart.addPatient(newP); It does not work if you add the first element to the list
         patientListStart.addPatient(newQ);
         patientListStart.addPatient(newR);
         patientListStart.addPatient(newS);
         patientListStart.addPatient(newT);

    }
    
    
    
}
