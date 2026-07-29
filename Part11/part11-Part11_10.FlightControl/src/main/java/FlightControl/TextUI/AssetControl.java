/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.TextUI;

import FlightControl.UI.*;
import FlightControl.data.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class AssetControl {
    private AssetUserInterface assetControl;    
    private Scanner scan;
    
    public AssetControl(Scanner scanner){
        this.assetControl = new AssetUserInterface();        
        this.scan = scanner;
    }    
    
    public AssetUserInterface exportData(){
        return this.assetControl;
    }
    
    public void printCommands(){       
        System.out.println("Airport Asset Control");
        System.out.println("[1] Add an airplane");
        System.out.println("[2] Add a flight");
        System.out.println("[x] Exit Airport Asset Control");
    }    
    
    public Airplane getPlane(String code){
        return this.assetControl.getPlanes().get(code);        
    }
    

    public void start(){        
        
        while (true){                       
            this.printCommands();
            String input = scan.nextLine();            
            if(input.equals("x")){                
                break;
            }
            
            if (input.equals("1")){
                System.out.println("Give the airplane id:");
                String code = scan.nextLine();
                System.out.println("Give the airplane capacity:");
                int capacity = Integer.parseInt(scan.nextLine());                    

                this.assetControl.addPlane(code, capacity);
            }
            
            if(input.equals("2")){                
                System.out.println("Give the airplane id:");
                Airplane code = this.getPlane(scan.nextLine());
                System.out.println("Give the departure airport id:");
                String depart = scan.nextLine();
                System.out.println("Give the target airport id: ");
                String dest = scan.nextLine();
                
                this.assetControl.addFight(depart, dest, code);                   
            }           
        }
    }
    
}
