
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        int grade = Integer.valueOf(scan.nextLine());
        
        String result = "";
        
        if (grade > 100){
            result = "Incredible";
        } else if (grade >= 90) {
            result = "5";
        } else if (grade >= 80) {
            result = "4";
        } else if (grade >= 70) {
            result = "3";
        } else if (grade >= 60) {
            result = "2";            
        } else if (grade >= 50) {
            result = "1";
        } else if (grade < 0){
            result = "imposible!";
        } else {
            result = "failed";
        }
        
        System.out.println("Grade: " + result);
    }
}
