package com.mycompany.coffemachine;

public class Americano extends Beans {
    
    
        private int caffinesingle=60;
        private int caffinedouble=122;
   public Americano(int amount_of_Arabica,int amount_of_Robusta)
   {
   super(amount_of_Arabica,amount_of_Robusta);
   } 
   public Americano()
   { 
       
   }
    
    @Override   
    public void single_arabica()
    {
        this.amount_of_Arabica-=7;
        
    }
    @Override
    public void double_arabica()
    {
        this.amount_of_Arabica-=14;
    }
    @Override
    public void single_robusta()
    {
        this.amount_of_Robusta-=7;
    }
    @Override
    public void double_robusta()
    {
        this.amount_of_Robusta-=14;
    }

    
    public int Caffine_Americano_single()
    {
        return 60;
    }
    public int cas()
    {
        return 80;
    }
    
    public int Caffine_Americano_double()
    {
        return 122;
    }
public int cat()
{
    return 154;
}
    @Override
    public String toString() {
        return "Americano{" + "" +  '}';
    }
    public String GETINFO()
    {
        return "Caffine single between"+" "+Caffine_Americano_single()+"--"+" "+cas()+"Caffine double between"+" "+Caffine_Americano_double()+"--"+cat();
    }
    
    
    
}
