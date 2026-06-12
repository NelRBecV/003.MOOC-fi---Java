import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> hashList = new HashSet();
        hashList.add("A");
        hashList.add("B");
        hashList.add("C");
        hashList.add("A");
        hashList.add("B");
        
        System.out.println(returnSize(hashList));
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set list){
        return list.size();
    }
}
