import java.util.*;


public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array1 = {3, 1, 5, 99, 3, 12};
        ArrayList<Integer> array2 = new ArrayList<>();
        
        for (int i : array1){
            array2.add(i);
        }
        
        String[] array3 = {"sometimes","I","think","about","killing","myself"};
        ArrayList<String> array4 = new ArrayList<>();
        
        for (String i: array3){
            array4.add(i);
        
        }
            
        sort(array1);
        sort(array3);
        sortIntegers(array2);
        sortStrings(array4);
            
        System.out.println(Arrays.toString(array1));
        System.out.println((array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array4);
            
        
        
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
