
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings){
        if (strings.size() == 0){
            return;
        }
        strings.remove(strings.size()-1);
    }
    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi!");
        list.add("everyone,");
        list.add("how");
        list.add("are");
        list.add("you?");
        list.add("Seeya");
        list.add("Bye");
        System.out.println(list);
        removeLast(list);
        System.out.println(list);
    }

}
