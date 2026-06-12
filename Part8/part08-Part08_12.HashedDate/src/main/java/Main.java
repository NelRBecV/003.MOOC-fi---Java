import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d1 = new SimpleDate(19, 1, 1900);
        SimpleDate d2 = new SimpleDate(19, 1, 1901);
        SimpleDate d3 = new SimpleDate(19, 1, 2100);
        
        HashMap<SimpleDate,String> dates = new HashMap<>();
        dates.put(d1, "yesterday");
        dates.put(d2, "today");
        dates.put(d3, "tomorrow");
        
        
        System.out.println(d1.equals(d1));
        System.out.println(d1.hashCode());
        System.out.println(d2.equals(new SimpleDate(2, 2, 2000)));
        System.out.println(d2.hashCode());
        System.out.println(d3.equals(new SimpleDate(5, 2, 2000)));
        System.out.println(d3.hashCode());
        
        
    }
}
