package com.mycompany.coffemachine;

public class WaterTank {
    private int Water;

    public WaterTank(int Water) {
        this.Water = Water;
    }
    public WaterTank()
    {
        
    }
    

    public int getWater() {
        return Water;
    }

    public void setWater(int Water) {
        if(Water>600)
        {
            ArithmeticException kn=new ArithmeticException("More than the capacity");
            throw kn;
        }
        else
        {
        this.Water = Water;
        }
    }
    
        public  void drainWater(int Watervalue)
    {
        if(Watervalue>this.Water)
        {
           ArithmeticException ae=new ArithmeticException("No enough Water");
           throw ae;
        }
        else
        {
         this.Water-=Watervalue;

        }
        
    }

    
    
    


    public String getInfo() {
        return "WaterTank{" + "Water=" + Water + '}';
    }
    
}
