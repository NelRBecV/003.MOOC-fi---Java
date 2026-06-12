/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Comparator;
/**
 *
 * @author Yo
 */
public class SortBySuit implements Comparator<Card>{
    
    @Override
    public int compare(Card c1, Card c2){
        if(c1.getSuit() == c2.getSuit()){
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
    
}
