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
    private JokeManager jokes;
    private Scanner scan;
    
    public UserInterface(JokeManager jokeList, Scanner scanner){
        this.jokes = jokeList;
        this.scan = scanner;        
    }
    
    public void menu(){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    
    }
    
    public void start(){
        this.menu();
        while (true) {
            System.out.println("Command: ");            
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokes.drawJoke());
            
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
    
    }
}
