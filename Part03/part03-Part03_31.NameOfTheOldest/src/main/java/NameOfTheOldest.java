
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldName = "";
        int oldAge = 0;
        while(true){
            String text = scanner.nextLine();
            if (text.isEmpty()){
                break;
            }
            String[] data = text.split(",");
            int age = Integer.valueOf(data[1]);
            if (age > oldAge){
                oldAge = age;
                oldName = data[0];
            }
            
        }
        System.out.println("Name of the oldest: " + oldName);


    }
}
