package com.mycompany.coffemachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CoffeeMaker {
private int wc;
private int bc;
private int rc;
private int coc;
    public CoffeeMaker() {
        
        
        
        
        
        
        
        
        
        
        
    }
    
   // private  CoffeeLogger logger = null;
      //  public CoffeeMaker(CoffeeLogger logger) {
       // this.logger = logger;
    //}

   // public void makeCoffee() {
      //  logger.log("Coffee made.");
   // }
    
    
    
    
    
    Beans by=new Beans(70,70);
          WaterTank wgh=new WaterTank(599);
 private int Water;
 private int robustabeans;
 private int arabicabeans;
 private int counters;
                     //File configFile = new File("config.txt");
      //File configFile = new File("config.txt");

    public void serialization()
    {
                        try
        {
                  File configFile = new File("config.txt");


                    Scanner eyes=new Scanner(configFile);
                    int [] pudge=new int[4];
                    for(int i=0;i<4;i++)
                    {
                        String monkey=eyes.nextLine();
                        for(int j=0;j<monkey.length();j++)
                        {
                            if(monkey.charAt(j)=='=')
                            {
                                pudge[i]=Integer.parseInt(monkey.substring(monkey.length()-2),0   );
                                break;
                            }
                        }
                    }
                   Water=pudge[0];
                   robustabeans=pudge[1];
                   arabicabeans=pudge[2];
                   counters=pudge[3];

        }
        catch(FileNotFoundException ex)
        {
            try
            {
                File file=new File("config.txt");
                if(file.createNewFile())
                {
                    JOptionPane.showMessageDialog(null,"no config file.. Create new one done");
                }
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage()); 
                System.exit(0);
            }
            
            
            
        }

        
        
        
        
        
        
        
    }
    
    
    
           public void update(int waterLevel, int robustaLevel, int arabicaLevel, int servedCups) throws FileNotFoundException {
        this.Water = waterLevel;
        this.robustabeans = robustaLevel;
        this.arabicabeans = arabicaLevel;
        this.counters = servedCups;
      File configFile = new File("config.txt");

           
       FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(configFile);
            fileWriter.write("Water level = " + getWater() + "\n");
            fileWriter.write("Robusta level = " + getRobustabeans()   + "\n");
            fileWriter.write("Arabica level = " + getArabicabeans() + "\n");
            fileWriter.write("Number of served cups = " + getCounters() + "\n");
        }
        catch(FileNotFoundException ex) {
            try {
                File file = new File("config.txt");
                if (file.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Configurations file was not found, a new one is created!");
                }
            } 
            catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
 
        }
        finally{
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }
                catch(IOException ex){
                    JOptionPane.showMessageDialog(null, "Could not close the configurations file!");
                    System.exit(0);
                }
            }
        }
    }

    public int getWater() {
        return Water;
    }

    public void setWater(int Water) {
        this.Water = Water;
    }

    public int getRobustabeans() {
        return robustabeans;
    }

    public void setRobustabeans(int robustabeans) {
        this.robustabeans = robustabeans;
    }

    public int getArabicabeans() {
        return arabicabeans;
    }

    public void setArabicabeans(int arabicabeans) {
        this.arabicabeans = arabicabeans;
    }

    public int getCounters() {
        return counters;
    }

    public void setCounters(int counters) {
        this.counters = counters;
    }

          
          
          
          
          
          
          
          
          
          
          
          
    

}
