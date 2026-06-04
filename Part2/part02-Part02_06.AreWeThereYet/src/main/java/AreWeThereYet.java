
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 4;
        int userNumber = 0; 
        while (userNumber != goal){
            System.out.println("Give a number:");
            userNumber = Integer.valueOf(scanner.nextLine());            
        }
    }
}
