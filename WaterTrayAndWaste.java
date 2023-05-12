package com.mycompany.coffemachine;

public class WaterTrayAndWaste {
    private int capacity;
    private int level;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void residual ()
    {
         this.level+=1;
    }
 
    public void clean()
    {
        capacity=0;
        
    }
    
    
}
