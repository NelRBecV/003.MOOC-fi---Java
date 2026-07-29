
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

            String input = scan.nextLine();
            if (input.equals("quit")) {                
                break;
            }
            
            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);
            
            if(amount < 0){
                amount = 0;
            }
            
            if(command[0].equals("add")){                
                if(first + amount < 100){
                    first += amount;
                } else {
                    first = 100;
                }                
            }
            
            if(command[0].equals("move")){
                int litres = 0;
                if(first < amount){
                    litres = first;
                } else {
                    litres = amount;
                }
                
                first -= litres;
                second += litres;
                
                if(second > 100){
                    second = 100;
                }                
            }
            
            if(command[0].equals("remove")){
                second -= amount;
                if(second < 0){
                    second = 0;
                }
            }                        
        }        
       
    }

}
