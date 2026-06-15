
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
                
        List<Integer> myList = new List<>();
        
        myList.add(5);
        myList.add(2);        
        myList.add(15);
        
        for(int item = 0; item <  myList.size(); item++){
            System.out.println(myList.value(item));
        }
        System.out.println("");   
        
        myList.remove(2);        
        System.out.println("");
        
        for(int item = 0; item <  myList.size(); item++){
            System.out.println(myList.value(item));
        }
        
        System.out.println("");   
        
        System.out.println(myList.contains(5));
        int index = myList.indexOfValue(15);
        
        System.out.println(index);
        System.out.println(myList.value(index));
        
        myList.remove(15);
        System.out.println(myList.contains(15));
        
        List<Integer> newList = myList;
        
        for (int i = 0; i< newList.size(); i++ ){
            System.out.println(newList.value(i));
        }
    }

}
