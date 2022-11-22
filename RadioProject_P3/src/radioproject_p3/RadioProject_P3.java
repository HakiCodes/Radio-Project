/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioproject_p3;
import java.util.Scanner;
/**
 *
 * @author nokolie23
 */
public class RadioProject_P3 
{    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        radio sony = new radio();
        sony.setpower(true);
        
        while(sony.getpower())
        {
            int choice = 0;
            System.out.println("--------SONY SELECTION SCREEN--------");
            System.out.println("1: Change Volume");
            System.out.println("2: Change Station");
            System.out.println("3: Power Off");
            
            choice = in.nextInt();
        
            if(choice == 1)
            {
                System.out.println("Input desired volume (1-100):");
                int vol = in.nextInt();
                sony.setvolume(vol);
                System.out.println("Volume set: " + sony.getvolume());
            }   
        
            if(choice == 2)
            {
                System.out.println("Please input station number.");
                double ss = in.nextDouble();
                sony.setstation(ss);
                System.out.println("Station set: " + sony.getstation());
            }
        
            if(choice == 3)
            {
                System.out.println("Powering down...");
                sony.setpower(false);
            }
        }
    }
}
