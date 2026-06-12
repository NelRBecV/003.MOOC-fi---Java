import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scan = new Scanner(System.in);
        Checker reviewer = new Checker();
        
        System.out.println("Enter a string: ");               
        String word = scan.nextLine().toLowerCase();
                
        if(reviewer.isDayOfWeek(word)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if(reviewer.allVowels(word)){            
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        if(reviewer.timeOfDay(word)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
    }
}
