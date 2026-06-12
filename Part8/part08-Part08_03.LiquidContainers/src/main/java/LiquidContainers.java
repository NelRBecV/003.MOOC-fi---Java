
import java.util.Scanner;

public class LiquidContainers {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

       
        
        while (true) {
            System.out.print("");
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("quit")) {
                break;
            }
            if (input[0].equals("add")){
                int amount = Integer.valueOf(input[1]);
                if(amount > 0){
                    first += amount;
                    if(first>100){
                        first = 100;
                    }
                }
            }
            if(input[0].equals("move")){
                int amount = Integer.valueOf(input[1]);
                if(first < amount){
                    amount = first;
                }
                
                first -= amount;
                second += amount;
                
                if(second > 100){
                    second = 100;
                }                
            }
            
            if(input[0].equals("remove")){
                int amount = Integer.valueOf(input[1]);
                if(amount > 0){
                    second -= amount;
                    if(second < 0){
                        second = 0;
                    }
                }                
            }

        }
    }
   

}
