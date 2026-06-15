
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            
            int number = Integer.valueOf(input);
            int cube = 1;
            
            for (int i=0;i<3; i++){
                cube *= number;
            }
            
            System.out.println(cube);
        }

    }
}
