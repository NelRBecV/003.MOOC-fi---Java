/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private TodoList list;
    
    public UserInterface(TodoList toDo,Scanner scanner){
        this.scan = scanner;
        this.list = toDo;
    }
    
    public void menu(){
        System.out.println("");
    }
    
    public void start(){
        
        while(true){
            System.out.println("command: ");
            String command = scan.nextLine();
            
            if (command.equals("add")){
                System.out.println("To add: ");
                String task = scan.nextLine();
                list.add(task);
            }
            
            if(command.equals("list")){
                list.print();
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int taskNumber = Integer.valueOf(scan.nextLine());
                list.remove(taskNumber);
            }
            
            if(command.equals("stop")){
                break;
            }        
        }
    
    }
}
