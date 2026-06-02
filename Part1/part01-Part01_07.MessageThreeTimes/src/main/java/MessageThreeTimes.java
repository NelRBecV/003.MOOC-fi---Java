
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String threeTimes = scanner.nextLine();
        
        System.out.println(threeTimes);
        System.out.println(threeTimes);
        System.out.println(threeTimes);
    }
}
