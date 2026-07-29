
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scan = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI userInterface = new TextUI(scan,dictionary);
        userInterface.start();
        
    }
}
