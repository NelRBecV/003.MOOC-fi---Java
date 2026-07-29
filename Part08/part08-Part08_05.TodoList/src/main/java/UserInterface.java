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
public class UserInterface {
    private Scanner input;
    private TodoList pendings;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.input = scanner;
        this.pendings = list;
        
    }
    
    public void menu(){
        System.out.println("Commands: ");
        System.out.println("add - adds a new task ");
        System.out.println("completed - marks a task as completed ");
        System.out.println("list - lists all pending tasks");
        System.out.println("stop - finnish the program");
    }
    
    public void start(){
        this.menu();
        while (true){
            System.out.println("Command: ");
            String command = input.nextLine();
            
            if (command.equals("add")){
                System.out.println("Task: ");
                String task = input.nextLine();
                if (!task.isBlank()){
                    pendings.add(task);
                }
            }
            
            if (command.equals("remove")){
                
                System.out.println("Which one is removed? ");
                int taskNumber = Integer.valueOf(input.nextLine());
                              
                pendings.remove(taskNumber);
            }
            
            if (command.equals("list")){
                pendings.print();
            }
            
            if (command.equals("stop")){
                break;
            }
        }
    }
}
