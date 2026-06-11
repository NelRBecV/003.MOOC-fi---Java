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
public class TextUI {
    private Scanner read;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.dictionary = dict;
        this.read = scanner;
    }
    
    public void start(){
        //The best way to have done this was creating separate functions
        //e.g. add(), end(), search()
        while(true){
            System.out.println("Command: ");
            String command = read.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye-bye!");
                break;
            }
            
            if (command.equals("add")){
                System.out.println("Word:");
                String word = this.read.nextLine();
                System.out.println("Translation:");
                String trans = this.read.nextLine();
                
                if (!word.isBlank() && !trans.isBlank()){
                    dictionary.add(word, trans);
                    continue;
                }
            }    
            if (command.equals("search")){
                System.out.println("To be translated: ");
                String word = read.nextLine();
                String find = this.dictionary.translate(word);                
                if(find == null){
                    System.out.println("Word " + word + " was not found");    
                }else{
                    System.out.println("Translation: " + find); 
                }
                continue;
            }            
            System.out.println("Unknown command");
        }
    }
        
    
}
