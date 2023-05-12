package com.mycompany.coffemachine;

public class Espresso extends Beans {
   // private Beans Be;
    private String Espresso_Coffe;
    private int caffine;
    private int calories;
   public Espresso(int amount_of_Arabica,int amount_of_Robusta)
   {
   super(amount_of_Arabica,amount_of_Robusta);
   } 
   public Espresso()
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
     // now for the caffine and calories in espresso
//-------------------------------------
//-------------------------------------
//-------------------------------------
//-------------------------------------
    
    public int get_c_s_a()
    {
        return 90;
    }
    public int get_c_d_a()
    {
        return 130;
    }
    public int get_c_s_r()
    {
        return 125;
    }
    public int get_c_d_r()
    {
        return 180;
    }

    public int getCaffine() {
        return caffine;
    }

    public void setCaffine(int caffine) {
        this.caffine = caffine;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getEspresso_Coffe() {
        return Espresso_Coffe;
    }

    public void setEspresso_Coffe(String Espresso_Coffe) {
        this.Espresso_Coffe = Espresso_Coffe;
    }
    

    
    

    public String getInfo1()
    {
        return "caffine single between "+" "+get_c_s_a()+"--"+get_c_s_r()+"caffine double between "+""+get_c_d_a()+"-- "+get_c_d_r();
        
    }

    @Override
    public String toString() {
        return "Espresso{" + '}';
    }
    
    
    
    
    
}
