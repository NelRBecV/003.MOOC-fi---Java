/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.TextUI;

import FlightControl.UI.*;
import FlightControl.data.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class FlightControl {
    
    private AssetUserInterface data;    
    private Scanner scan;
    
    public FlightControl(AssetUserInterface data,Scanner scanner){
        this.data = data;        
        this.scan = scanner;
        
    }
    
    public void printCommands(){ 
        System.out.println("Flight Control");
        System.out.println("[1] Print airplanes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print airplane details");
        System.out.println("[x] Quit");
    }
    
    public void start(){
        //System.out.println("Choose an action:");
        while(true){
            this.printCommands();
            String input = scan.nextLine();
            
            if(input.equals("x")){
                break;
            }
            
            if (input.equals("1")){
                for (Airplane plane: this.data.getPlanes().values()){
                    System.out.println(plane);
                }
            }
            
            if (input.equals("2")){
                for (Flight flight: this.data.getFlights().values()){
                    System.out.println(flight);
                }
            }
            
            if(input.equals("3")){
                System.out.println("Give the airplane id:");
                String code = scan.nextLine();
                
                System.out.println(this.data.getPlanes().get(code));
            }
        }
    }   
}
