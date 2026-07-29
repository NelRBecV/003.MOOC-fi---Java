
import java.util.ArrayList;
import java.util.Collections;


public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();               
        humans.add(new Human("Merja", 2500));
        humans.add(new Human("Pertti", 80));
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Nitti", 100000));
        humans.add(new Human("Tutti", 2500));
        humans.add(new Human("Potti", 150000));

        System.out.println(humans);

        /*
         * Uncomment the comment below when you have completed the compareTo-method.
         */
        Collections.sort(humans); 
        System.out.println(humans);

    }
}
