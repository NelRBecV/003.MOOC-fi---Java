
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {            
            System.out.print("");            
            
            System.out.println("First: " + first + "\n" + "Second: " + second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] data = input.split(" ");
            int amount = Integer.valueOf(data[1]);
            
            if (data[0].equals("add")){                
                first.add(amount);
            }
            
            if (data[0].equals("move")){                
                if(amount > first.contains()){
                    amount = first.contains();
                }
                
                first.remove(amount);
                second.add(amount);
            }
            
            if (data[0].equals("remove")){                
                second.remove(amount);
            }
        }
    }

}
