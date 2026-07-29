import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> array = new ArrayList();
        for(int i = 0; i < 10; i++){
            array.add(String.valueOf(i));
        }
        
        System.out.println(returnSize(array));

    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    
    public static int returnSize(List<String> elements){
        return elements.size();
    }
}
