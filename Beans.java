package com.mycompany.coffemachine;

public class Beans implements getinfo {
    
    private String Arabica="Arabica";
    private String Robusta="Robusta";
    private String Blend;
    
    protected int amount_of_Arabica;
    protected int amount_of_Robusta;
    //private int amt_arab=amount_of_Arabica;
   // private int amt_robusta=amount_of_robusta;
  
    
 public Beans(int amount_of_Arabica,int amount_of_Robusta)
 {
    //this.amount_of_Arabica=50;
   // this.amount_of_Robusta=50;
   // this.amount_of_Blend=50;
 }
  public Beans()
 {
    //this.amount_of_Arabica=50;
   // this.amount_of_Robusta=50;
   // this.amount_of_Blend=50;
 }

    public void set(int amount_of_Arabica,int amount_of_Robusta)
    {
   this.amount_of_Arabica=amount_of_Arabica;
   this.amount_of_Robusta=amount_of_Robusta;
  
    }
    public void single_arabica()
    {
        this.amount_of_Arabica-=7;
        
    }
    public void double_arabica()
    {
        this.amount_of_Arabica-=14;
    }
    public void single_robusta()
    {
        this.amount_of_Robusta-=7;
    }
    public void double_robusta()
    {
        this.amount_of_Robusta-=14;
    }

    public int getAmount_of_Arabica() {
        return amount_of_Arabica;
    }

    public int getAmount_of_Robusta() {
        return amount_of_Robusta;
    }

    public String getArabica() {
        return Arabica;
    }

    public String getRobusta() {
        return Robusta;
    }
    
    
    
    public  void drainArabica(int ArabicaValue)
    {
        if(ArabicaValue>this.amount_of_Arabica)
        {
           ArithmeticException are=new ArithmeticException("No enough Arabica Beans");
           throw are;
        }
        else
        {
         this.amount_of_Arabica-=ArabicaValue;

        }
        
    }
        public  void drainRobusta(int RobustaValue)
    {
        if(RobustaValue>this.amount_of_Robusta)
        {
           ArithmeticException re=new ArithmeticException("No enough Robusta Beans");
           throw re;
        }
        else
        {
         this.amount_of_Robusta-=RobustaValue;

        }
        
    }


    

    @Override
    public String getInfo() {
        return "The amount of Arabica Beans is"+" "+this.amount_of_Arabica+" "+"The amount of Robusta Beans is"+" "+this.amount_of_Robusta+" ";
    }

    public String tosak() {
        return "Beans{" + "Arabica=" + Arabica + ", Robusta=" + Robusta + '}';
    }
    

    
    
    
    
    
    
}
