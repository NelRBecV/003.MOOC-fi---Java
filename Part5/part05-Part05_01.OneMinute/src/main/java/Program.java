
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer stopwatch = new Timer();
        while (true){
            System.out.println(stopwatch);            
            stopwatch.advance();
            try {
                Thread.sleep(10);
            }
            catch (Exception e){
                
            }
        }

    }
}
