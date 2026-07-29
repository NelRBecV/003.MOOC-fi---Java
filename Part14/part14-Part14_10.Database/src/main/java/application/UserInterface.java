package application;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;


public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {                
                break;
            }

            // implement the functionality here
            if (command.equals("1")){
                System.out.println("Listing the database contents");
                database.list().forEach((todo)-> System.out.println(todo));
            }
            
            if (command.equals("2")){
                System.out.println("Adding a new todo");                
                int id = database.list().size() + 1;
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter Description");
                String desc = scanner.nextLine();                
                
                database.add(new Todo(id,name,desc,false));
            }
            
            if (command.equals("3")){
                System.out.println("Which todo should be marked as done (give the id)?");
                int indexId = scanner.nextInt();
                for(Todo todo: database.list()){                
                    if (indexId == todo.getId()){                                                
                        database.markAsDone(indexId);
                    }
                }
            }
            
            if (command.equals("4")){
                System.out.println("Which todo shuld be remoed (give the id)?");
                int targetId = scanner.nextInt();                
                    database.remove(targetId);                    
            }
        }

        System.out.println("Thank you!");
    }

}
