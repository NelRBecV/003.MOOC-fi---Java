
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> positives = numbers.stream()                                              
                                        .filter(number -> number > 0)
                                        .collect(Collectors.toCollection(ArrayList::new));
                                              
        return positives;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // test your method here
        ArrayList<Integer> numbers = new ArrayList();
       numbers.add(5);
       numbers.add(2);
       numbers.add(-3);
       numbers.add(-4);
       numbers.add(-8);
       numbers.add(11);
       numbers.add(-15);
       numbers.add(-4);
        System.out.println("positive numbers: " + positive(numbers));
    }

}
