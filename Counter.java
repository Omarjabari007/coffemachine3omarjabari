package com.mycompany.coffemachine;

public class Counter implements getinfo {
 private int counter=0;
 
 public  Counter()
 {
     
     
 }
 public void counter()
 {
     counter+=1;
 }
 public void reset()
 {
     counter=0;
 }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    
    
    
    
    
    @Override
    public String getInfo() {
        return "The Total cups of coffe equal to"+getCounter();
        
    }
    
    
}
