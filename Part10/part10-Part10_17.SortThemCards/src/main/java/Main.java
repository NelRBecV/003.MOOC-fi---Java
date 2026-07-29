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
        /*Suit[] suits = {Suit.CLUB,Suit.DIAMOND,Suit.HEART,Suit.SPADE};
        Card card0 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card1 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card2 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card3 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card4 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);

        Card card5 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card6 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card7 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card8 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        Card card9 = new Card((int)Math.floor((Math.random()*12)+2), suits[(int)Math.floor(Math.random()*4)]);
        
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
                
        hand1.add(card0);
        hand1.add(card1);
        hand1.add(card2);
        hand1.add(card3);
        hand1.add(card4);
        
        hand2.add(card5);
        hand2.add(card6);
        hand2.add(card7);
        hand2.add(card8);
        hand2.add(card9);
        
        System.out.println("Hands unsorted");
        hand1.print();        
        System.out.println("");
        hand2.print();
        
        System.out.println("Hands sorted");
        hand1.sortBySuit();
        hand1.print();        
        System.out.println("");
        
        hand2.sortBySuit();
        hand2.print();*/
        
    }
}
