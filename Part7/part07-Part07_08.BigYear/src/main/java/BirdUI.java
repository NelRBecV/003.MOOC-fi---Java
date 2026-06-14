import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class BirdUI {
    private Scanner input;
    private ArrayList<Bird> birds;
    
    public BirdUI(Scanner scanner){
        this.input = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String bird, String name){
        this.birds.add(new Bird(bird,name));        
    }
    
    public void birdObservation(String bird){        
        for (Bird specie : birds){
            if (specie.getName().equals(bird)){
                specie.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printOne(String name){
        for (Bird bird : birds){
            if (bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printAll(){
        for (Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public void runProgram(){
        System.out.println("Menu: ");
        
        while(true){
            System.out.println("?");
            String command = input.nextLine();
            
            if(command.equals("Quit")){
                break;
            }
            
            if(command.equals("Add")){
                System.out.println("Name: ");
                String name = input.nextLine();
                
                System.out.println("Name in Latin: ");
                String latin = input.nextLine();
                
                if (!name.isBlank() && !latin.isBlank()){
                    this.addBird(name,latin);
                }
            }
            
            if(command.equals("Observation")){
                System.out.println("Bird?");
                String bird = input.nextLine();
                this.birdObservation(bird);
            }
            
            if (command.equals("One")){
                System.out.println("Bird?");
                String bird = input.nextLine();
                this.printOne(bird);        
            }
        
            if (command.equals("All")){
                this.printAll();
            }
                
        }
    }
}
