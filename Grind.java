package com.mycompany.coffemachine;

public class Grind  {
 private int size_of_grind;
    public Grind()
    {
        //default
        size_of_grind=3;
        
    }

    public int getSize_of_grind() {
        return size_of_grind;
    }
    
    public String getinfo()
    {
        return "The Grind size level is "+" "+this.size_of_grind;
    }

    public void setSize_of_grind(int size_of_grind) {
        //
        this.size_of_grind = size_of_grind;
    }
    
    
}
