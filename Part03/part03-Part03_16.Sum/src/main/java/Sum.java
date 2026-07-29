
import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList<Integer> numbers){
        int total =0;
        if (numbers.size() == 0){
            return -1;
        }
        for(int num:numbers){
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(15);
        numbers.add(6);
        numbers.add(3);
        System.out.println(sum(numbers));
    }

}
