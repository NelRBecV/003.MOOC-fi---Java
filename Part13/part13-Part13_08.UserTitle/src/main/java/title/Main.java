package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your system name: ");
        String sysName = scan.nextLine();
        
        Application.launch(UserTitle.class, "--name="+sysName);
        System.out.println("Hello world!");
        
        

    }

}
