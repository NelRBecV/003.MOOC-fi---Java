import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Recipes {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipes(String name, int time,ArrayList<String> ingredients){
        this.name = name;
        this.cookTime = time;
        this.ingredients = ingredients;
    }
    
    public String getRecipeName(){
        return this.name;
    }
    
    public int getRecipeCookingTime(){
        return this.cookTime;
    }
    
    public ArrayList<String> getRecipeIngredients(){
        return this.ingredients;
    }
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookTime;
    }
}
