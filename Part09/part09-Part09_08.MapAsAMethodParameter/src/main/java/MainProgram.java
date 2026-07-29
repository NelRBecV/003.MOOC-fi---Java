import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String,String>newList = new HashMap();
        newList.put("un", "uno");
        newList.put("deux", "dos");
        newList.put("trois", "tres");
        newList.put("quatre", "cuatro");
        newList.put("cinq", "cinco");
        newList.put("six", "seis");
        newList.put("sept", "siete");
        newList.put("huit", "ocho");
        newList.put("neuf", "nueve");
        newList.put("dix", "diez");
        
        System.out.println(returnSize(newList));
        
        

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String,String> mapList){
        return mapList.size();
    }
}
