
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        //1. type in two numbers
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second;
        
        System.out.println(Math.sqrt(first + second));
    }
}
