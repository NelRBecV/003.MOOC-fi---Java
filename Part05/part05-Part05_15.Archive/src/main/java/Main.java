
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item>archive = new ArrayList<>();
        while(true){
            System.out.println("Idetifier? (empty will stop)");
            String code = scan.nextLine();
            if(code.isBlank()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String desc = scan.nextLine();
            if (desc.isBlank()){
                break;
            }
            Item item = new Item(code,desc);
            if (!(archive.contains(item))){
                archive.add(item);
            }
            
        }
        System.out.println("==Items==");
        //the usual way
        /*for(Item element:archive){
            System.out.println(element);
        }*/
        
        //Another way
        archive.forEach((element)-> {System.out.println(element);});

    }
}
