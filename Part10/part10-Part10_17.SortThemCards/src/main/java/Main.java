import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here        
        
        Hand hand = new Hand();
        hand.add(new Card(14,Suit.SPADE));
        hand.add(new Card(12,Suit.HEART));
        hand.add(new Card(14,Suit.DIAMOND));        
        hand.add(new Card(2,Suit.SPADE));
        hand.add(new Card(7,Suit.DIAMOND));
        
        hand.sortBySuit();
        hand.print();
        
        BySuitInValueOrder comp = new BySuitInValueOrder();
        Card first = new Card(3,Suit.CLUB);
        Card second = new Card(2,Suit.SPADE);
        System.out.println(comp.compare(first, second));
   }
}
