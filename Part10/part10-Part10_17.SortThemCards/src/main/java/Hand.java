/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Yo
 */
public class Hand implements Comparable<Hand>{
    private List<Card> playerHand;
    
    public Hand(){
        this.playerHand = new ArrayList();
    }
    
    public void add(Card card){
        this.playerHand.add(card);
    }
    
    public void print(){
        playerHand.forEach(card -> System.out.println(card));
    }
    
    public void sort(){                
       this.playerHand.sort((card1,card2)-> card1.getSuit().ordinal()-card2.getSuit().ordinal());
       this.playerHand.sort((card1,card2)-> card1.getValue() - card2.getValue());
    }
    
    public void sortBySuit(){        
        Collections.sort(playerHand, new SortBySuit());       
    }   
       
    @Override
    public int compareTo(Hand otherHand){
        return playerHand.stream().mapToInt(value -> value.getValue())
                .reduce(0,(sum, card) -> sum + card) -                
               otherHand.playerHand.stream().mapToInt(value -> value.getValue())
               .reduce(0,(sum,card) -> sum + card);                
    }
}
