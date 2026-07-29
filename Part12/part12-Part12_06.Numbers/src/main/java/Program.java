
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random zeroToTen = new Random();
        
        System.out.println("How namy random numbers should be printed?");
        int times = scanner.nextInt();
        
        for(int j = 0; j < times; j++){
            System.out.println(zeroToTen.nextInt(11));
        }
    }

}
