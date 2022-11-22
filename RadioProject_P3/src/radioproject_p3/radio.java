/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioproject_p3;

/**
 *
 * @author nokolie23
 */
public class radio 
{    
    private int volume;
    private double station;
    private String name;
    private boolean power;
    private String brand;
    //mutator
    public radio()
    {
        volume = 5;
        name = "Radio";
        station = 101.5;
        power = true;
    }
    public void setbrand(String newname)
    {
        brand = newname;
    }
    public void setstation(double s)
    {
        station = s;
    }
    //accessor
   public double getstation()
   {
       return station;
   }
   //mutator for vol.
   void setvolume(int v)
   {
       volume = v;
   }
   //accessor for vol.
   int getvolume()
   {
       return volume;
   }
   
   void setname(String n)
   {
       name = n;
   }
   
   String getname()
   {
       return name;
   }
   
   public void setpower(boolean p)
   {
       power = p;
   }
   
   public boolean getpower()
   {
       return power;
   }
}

