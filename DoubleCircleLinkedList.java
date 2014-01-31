/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class DoubleCircleLinkedList {
    int info;
    DoubleCircleLinkedList next;
    DoubleCircleLinkedList previous;
    DoubleCircleLinkedList head;
    
    public DoubleCircleLinkedList(int info){
        this.info = info;
    }
    
    public void first(DoubleCircleLinkedList first){
        head = first;
        first.next = first;
        first.previous = first;
        this.info = first.info;
    }
    
    public void add(DoubleCircleLinkedList second){
            second.previous = this;
            second.next = this.next;
            this.next.previous = second;
            this.next = second;
        
    }
    
    public void delete(DoubleCircleLinkedList toDelete){
        toDelete.next.previous = toDelete.previous;
        toDelete.previous.next = toDelete.next;
    }
    
    public void printLinks(){
        if (this!=head){
            System.out.println("info and next plus previous link:"
                    + " \ninfo:" + info + "\nnext:"+next+ "\nprevious:" + previous + "\nhead:"+head);
            this.next.printLinks();
            //still buggy
        }
    }
    
   
    
    
}
