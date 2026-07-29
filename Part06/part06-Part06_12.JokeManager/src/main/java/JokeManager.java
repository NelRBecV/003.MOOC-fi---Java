/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeList;
    
    public JokeManager(){
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokeList.add(joke);
    }
    
    public String drawJoke(){
        if(this.jokeList.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokeList.size());
        return this.jokeList.get(index);    
    }
    
    public void printJokes(){
        for(String joke: this.jokeList){
            System.out.println(joke);
        }
    }
}
