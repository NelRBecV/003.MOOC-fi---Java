
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    
    public static double averageYears(ArrayList<Integer> years){
        int sum = 0;
        for (int number : years){
            sum += Integer.valueOf(number);
        }
        return sum * 1.0/years.size();
    }
    public static String longestName(ArrayList<String> names){
        String longest = "";
        for (String name : names){
            if (longest.length() < name.length()){
                longest = name;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }
            
            String[] data = input.split(",");
            names.add(data[0]);
            years.add(Integer.valueOf(data[1]));          
        }
        System.out.println("Longest name: " + longestName(names));
        System.out.println("Average of the birth years: "+ averageYears(years));

    }
}
