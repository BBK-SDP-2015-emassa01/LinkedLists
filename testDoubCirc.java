/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class testDoubCirc {
    DoubleCircleLinkedList firstOfAnotherList = new  DoubleCircleLinkedList(1);
    
    public static void main (String[] args){
    testDoubCirc newList = new testDoubCirc();
    newList.launch();
    
    }
     public void launch(){
        
        firstOfAnotherList.first(firstOfAnotherList);
        
        DoubleCircleLinkedList another = new DoubleCircleLinkedList(2);
        firstOfAnotherList.add(another);
                
        DoubleCircleLinkedList andAnother = new DoubleCircleLinkedList(3);
        firstOfAnotherList.add(andAnother);
        
        //firstOfAnotherList.printLinks();
        
        firstOfAnotherList.delete(another);
        
        firstOfAnotherList.printLinks();
        
       

               }
}
