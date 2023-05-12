
package com.mycompany.coffemachine;
import static java.awt.PageAttributes.MediaType.B;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
        import java.util.logging.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import java.util.ArrayList;
import java.util.Date;
import static javax.print.attribute.standard.MediaSize.Engineering.B;

//v.2
//phase 2

public class CoffeMachine {

    public static void main(String[] args) throws FileNotFoundException {
// log file
            getconfig();
      // CoffeeLogger logger = new JavaLogger();
        //CoffeeMaker coffeeMaker = new CoffeeMaker(logger);
      private  CoffeeMaker cm=new CoffeeMaker();
        
       // CoffeeMaker cy=new CoffeeMaker();
      //  cy.serialization();   
      int you=0;
      // for file serilzattion and to save the work after exit the program :::
      /*
              public void getconfig()
        {
            wt.setWater(cm.getWater());
            B.set(cm.getArabicabeans(), cm.getRobustabeans());
            c.setCounter(cm.getCounters());
        }
*/

        cm.serialization();
        

           List<String> list=new LinkedList<>();
           ArrayList<Date> dateList = new ArrayList<>();
           ArrayList<Integer> numberList = new ArrayList<>();
           int caffcoffe=0;

           Date currentDate = new Date();
        Random rand = new Random();
                Beans B=new Beans();
                
                Espresso s=new Espresso();
                Americano A=new Americano();
                Counter c=new Counter();
                Grind G=new Grind();
                WaterTank wt=new WaterTank();
                // default value for flowrate is 250 by me will make it changeable later
                Machine M=new Machine(G,c,250,wt);
                //CaffineAndCalories c=new CaffineAndCalories();

   //cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());


        System.out.println("☕ Coffe By Omar Jabari ☕");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The Mini !! ");
        
        System.out.println("Press (1)  to Run the coffe machine");
        Scanner run=new Scanner(System.in);
        int start=run.nextInt();
       int jk=0;
       int calandcaffine=0;
        switch(start)
        {
            case 1:
                jk=1;
                break;    
            default:
                System.exit(0);
        }
    if(jk!=0)
    {
        System.out.println("Coffe machine operations !!☕");
        System.out.println("Press 0 Before Make any operation ....");
        System.out.println("....................................... ");
        System.out.println("....................................... ");

        System.out.println("0: Machine ON .. ");
        System.out.println("1: Fill The Machine with Beans and Water ");
        System.out.println("2: Make cup of coffe  ☕");
        System.out.println("3: Grind size control and Adjust the flowrate speed1");
        System.out.println("4: Print how many Cup of coffe or print Beans and Water remaining!!");
        System.out.println("5: Clean the Machine.");
        System.out.println("6: Print Caffine  of the last cup of coffe!!");
        System.out.println("7: Turn off The Machine.");

        Scanner input=new Scanner(System.in);
        int ok=input.nextInt(); 
        int option=0;
        do
        {
           getconfig();
            option=input.nextInt();
        
        switch(option)
        {
            case 0:
                System.out.println("Machine progress....");
                System.out.println("Machine is Working !");
                System.out.println("........");
            case 1:
                
                B.set(70,70);
                wt.setWater(599);
                System.out.println("Filling The Machine .......");
                System.out.println("Done...");
                   cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());

                break;
           case 2:
      cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());


               int x;

                    //  coffeeMaker.makeCoffee();
                       
                       

               M.WaterTray.residual();
                System.out.println("What Type of Coffe");
                System.out.println("1:Americano");
                System.out.println("2:Espresso");
                int f=input.nextInt();
                
                System.out.println("Type your Beans");
                System.out.println("1: Arabica");
                System.out.println("2: Robusta");
                x=input.nextInt();
                
                if(x==1)
                {
                    System.out.println("Choose Between ");
                    System.out.println("1:Single");
                    System.out.println("2:Double");
                    int y=input.nextInt();
                    if(y==1&&f==2)//espresso single arabica
                    {
                        caffcoffe=70;
                      //s.single_arabica();
                      try
                      {
                          B.drainArabica(7);
                      }
                      catch(ArithmeticException are)
                      {
                          System.out.println(are);
                      }
                      try
                      {
                      wt.drainWater(30+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }
                           

                    
                            dateList.add(currentDate);

                      calandcaffine=1;
                      c.counter();
                    }
                    else if(y==2&&f==2)
                    {
                        caffcoffe=130;
                        //s.double_arabica();
                        try
                      {
                          B.drainArabica(14);
                      }
                      catch(ArithmeticException are)
                      {
                          System.out.println(are);
                      }
                     try
                      {
                      wt.drainWater(60+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }

                        
                        
                        
                       dateList.add(currentDate);

                      calandcaffine=2;
                      c.counter();

                        
                    }
                    else if(y==1&&f==1)
                    {
                        caffcoffe=100;
                        //A.single_arabica();
                        try
                      {
                          B.drainArabica(7);
                      }
                      catch(ArithmeticException are)
                      {
                          System.out.println(are);
                      }
                    try
                      {
                      wt.drainWater(170+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }


                        
                        
                     dateList.add(currentDate);

                        c.counter();
                    }
                    else if(y==2&&f==1)
                    {
                        caffcoffe=160;
                        //A.double_arabica();
                        try
                      {
                          B.drainArabica(14);
                      }
                      catch(ArithmeticException are)
                      {
                          System.out.println(are);
                      }
                       try
                      {
                      wt.drainWater(220+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }


                        dateList.add(currentDate);
                        c.counter();
                    }
        // ok
                }
                else if(x==2)
                {
                    System.out.println("Choose Between");
                    System.out.println("1:Single");
                    System.out.println("2:Double");
                    int z=input.nextInt();
                    if(z==1&&f==2)
                    {
                        caffcoffe=140;  
                        //s.single_robusta();
                        try
                      {
                          B.drainRobusta(7);
                      }
                      catch(ArithmeticException re)
                      {
                          System.out.println(re);
                      }
                        try
                      {
                      wt.drainWater(30+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }
                        dateList.add(currentDate);
                    calandcaffine=3;
                    c.counter();

                    }
                    else if(z==2&&f==2)
                    {
                        //s.double_robusta();
                        caffcoffe=245;
                        try
                      {
                          B.drainRobusta(14);
                      }
                      catch(ArithmeticException re)
                      {
                          System.out.println(re);
                      }

                        try
                      {
                      wt.drainWater(60+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }
                        dateList.add(currentDate);
                        calandcaffine=4;
                        c.counter();
                    }
                    else if(z==1&&f==1)
                    {
                        caffcoffe=145;
                        //A.single_robusta();
                        try
                      {
                          B.drainRobusta(7);
                      }
                      catch(ArithmeticException re)
                      {
                          System.out.println(re);
                      }

                        
                        try
                      {
                      wt.drainWater(170+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }
                        dateList.add(currentDate);
                        c.counter();
                    }
                    else if(z==2&&f==1)
                    {
                        caffcoffe=240;
                        //A.double_robusta();
                        try
                      {
                          B.drainRobusta(14);
                      }
                      catch(ArithmeticException re)
                      {
                          System.out.println(re);
                      }

                        try
                      {
                      wt.drainWater(220+you);
                      }
                      catch(ArithmeticException ae) 
                      {
                          System.out.println(ae);
                          
                      }
                        dateList.add(currentDate);
                        c.counter();
                    }


                }
            if(c.getCounter()==5)
            {
                M.WaterTray.clean();
                JOptionPane.showMessageDialog(null,"WaterTray Automatic Cleaned Done");
            }

                break;
                
            case 3:
                      cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());

                                System.out.println("Enter your lvl Grind size and flowrate speed");
                int g=input.nextInt();
                int gg=input.nextInt();
                M.getGrind().setSize_of_grind(g);
                M.setFlowrate(gg);
                System.out.println("Size Entered Done and speed adjust done");
                if(M.getGrind()==2)
                {
                    you=20;

                }
                else if(M.getGrind()==3)
                {
                    you=30;
                }
                else if(M.getGrind()==4)
                {
                    you=40;
                }
                else 
                {
                    you=50;
                }
                   cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());

                
                break;
                
            case 4:
              cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());

                System.out.println( " Enter 1: Print the total Cups we 've made");
                System.out.println("  Enter 2: Reset The counter to zero");
                System.out.println("  Enter 3: Calculated the remaning Water ");
                System.out.println("  Enter 4: Calculated the remaning Beans");
                
                int i=input.nextInt();
                if(i==1)
                {
                int COunter = c.getCounter();
                    System.out.println("Total== "+" "+COunter);
                }
                else if(i==2)
                {
                    c.reset();
                }
                else if(i==3)
                {
                    System.out.println("Remaning water =="+M.getWet().getWater());
                }
                else
                {
                    System.out.println("Arabica beans=="+B.getAmount_of_Arabica());
                    System.out.println("Robusta beans=="+B.getAmount_of_Robusta());
                }
                
                break ;
                
            case 5:
                System.out.println("Cleaning in progress...");
                System.out.println("........................");
                B.set(0,0);
                M.getWet().setWater(0);
                M.getCounter().setCounter(0);
                cm.setWater(0);
                cm.setArabicabeans(0);
                cm.setRobustabeans(0);
               System.out.println("Cleaned completed");
               cm.update(wt.getWater(), B.getAmount_of_Robusta(), B.getAmount_of_Arabica(), c.getCounter());

                
                break;
            case 6:
                 System.out.println("1- Calculate  the approximate percentage of the caffine for each cup of coffee !!");
                System.out.println("2- Calculate the caffine of the last cup !!");

                int yui=input.nextInt();
                
                if(yui==1)
                {
                int gh=1;

                  for (Date date : dateList) {
               int randomNum = rand.nextInt((180 - 50) + 1) + 50;

                  System.out.print("Cup no# "+ gh +" ");
                  gh++;
              System.out.print(date+" ");
                            System.out.println("With caffine == "+" "+  randomNum );
                        }
              }
                else if(yui==2)
                {
                    System.out.println("The Caffine of last cup=="+" "+caffcoffe);
                }
                        

                
                

                
                
                
                
                
                break;
            case 7:
                System.out.println("Exit Done");
            System.exit(0);

               
                
                break;
                
            
            
            
        }
        }

        
        
        while(option!=-1);
        
        
        
        
        
     
  
    }
            

        
    }
    
        
        
}
