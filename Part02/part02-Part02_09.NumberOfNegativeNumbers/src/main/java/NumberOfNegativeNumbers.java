
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number: ");
            int negative = Integer.valueOf(scanner.nextLine());
            if (negative > 0) {
                continue;
            } else if (negative == 0){
                break;
            }
            count += 1;
        }
        System.out.println("Number of negative numbers: " + count);
    }   
}
