
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<Integer,Integer> numbers = new HashMap();
        HashMap<String,String> dictionary = new HashMap();
        
        String[] words = {"fire","wood","seed","leaf","branch","fox","wolf","deer","tree","rabbit"};
        String[] trans = {"fuego","leña","semilla","hoja","rama","zorro","lobo","ciervo","árbol","conejo"};
                
        
        for (int i = 0; i<10; i++){
            dictionary.add(words[i], trans[i]);
        }
        
        System.out.println(dictionary.get("wood"));
        System.out.println(dictionary.get("wolf"));
        System.out.println(dictionary.get("seed"));
        System.out.println(dictionary.get("rabbit"));
        System.out.println("");
        
        dictionary.add("wood","madera");
        dictionary.add("wolf","lobezno");
        dictionary.add("seed","grano");
        dictionary.add("rabbit","conejito");
        System.out.println("");
        
        for (int i = 0; i < 10; i++){
            System.out.println(dictionary.get(words[i]));
        }
        
        dictionary.remove("rabbit");
        dictionary.remove("wolf");
        System.out.println("");
        
        for (int i = 0; i < 10; i++){
            System.out.println(dictionary.get(words[i]));
        }
        
        
    }
    

}
