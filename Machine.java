package com.mycompany.coffemachine;

public class Machine {
    Grind grind=new Grind();
    Counter counter=new Counter();
    WaterTank Wet=new WaterTank();
    WaterTrayAndWaste WaterTray=new WaterTrayAndWaste();
    private int flowrate;
    //flow rate -> meaning
    // the slower your coffe shots will run and the lower the flow rate will be
    //. In terms of flowrate, most machines are somewhere between 250 and 500ml/30sec.
    public Machine()
    {
        
        }
public Machine(Grind grind,Counter counter,int flowrate,WaterTank Wet)
{
    this.grind=grind;
    this.counter=counter;
    this.flowrate=flowrate;
    this.Wet=Wet;
}
    public Grind getGrind() {
        return grind;
    }

    public void setGrind(Grind grind) {
        this.grind = grind;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public int getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(int flowrate) {
        this.flowrate = flowrate;
    }

    public WaterTank getWet() {
        return Wet;
    }

    public void setWet(WaterTank Wet) {
        this.Wet = Wet;
    }
    public void cleanWaterTray()
    {
        WaterTray.setCapacity(0);
    }

    public String getInfo() {
        return "Machine{" + "grind=" + grind + ", counter=" + counter + ", Wet=" + Wet + ", flowrate=" + flowrate + '}';
    }

    
    
    
    
    
    
    
}
