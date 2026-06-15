
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("input numbers, type \"end\" to stop.");
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            numbers.add(input);
        }
        
        System.out.println("Print th average of the negative or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        
        if (option.equals("p")){
            System.out.println(numbers.stream()
                                      .mapToInt(n -> Integer.valueOf(n))
                                      .filter(n -> n >= 0)
                                      .average()
                                      .getAsDouble()           
            );
        } else if (option.equals("n")){
            System.out.println(numbers.stream()                                      
                                      .mapToInt(n -> Integer.valueOf(n))
                                      .filter(n -> n < 0)
                                      .average()
                                      .getAsDouble()
            
            );
        }
        
        
    }
}
