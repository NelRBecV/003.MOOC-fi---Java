import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class RecipesProgramInterface {
    private Scanner input;
    private ArrayList<Recipes> list;
    
    public RecipesProgramInterface(Scanner scanner,ArrayList<Recipes> recipeList){
        this.input = scanner;
        this.list = recipeList;
    }
    public void commandsMenu(){
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredients");
    }
    
    private void printRecipes(){
        System.out.println("Recipes: ");
        for (Recipes meal : list){
            System.out.println(meal);
        }
    }
    
    private void findRecipesByName(String searchWord){        
        System.out.println("Recipes: ");
        for (Recipes recipe : list){            
            if (recipe.getRecipeName().contains(searchWord)){                
                System.out.println(recipe);
            }
        }
        
    }
    
    private void findRecipesByTime(int amount){
        System.out.println("Recipes: ");
        for (Recipes recipe : list){
            if(recipe.getRecipeCookingTime() <= amount){
                System.out.println(recipe);
            }
        }
    }
    
    private void findRecipesByIngredients(String recipeIngredient){
        System.out.println("Recipes: ");
        for (Recipes recipe : list){
            for (String ingredient : recipe.getRecipeIngredients()){                
                if(ingredient.equals(recipeIngredient)){
                    System.out.println(recipe);
                }
            }
        }
    }
    
    public void startProgram(){        
        while(true){
            System.out.println("Enter command: ");
            String command = input.nextLine();
            if (command.equals("stop")){
                break;
            }
            
            if(command.equals("list")){
                this.printRecipes();
            }
            
            if (command.equals("find name")){
                System.out.println("Searched word: ");
                String search = input.nextLine();
                this.findRecipesByName(search);
            }
            
            if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(input.nextLine());
                this.findRecipesByTime(time);
            }
            
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = input.nextLine();
                this.findRecipesByIngredients(ingredient);
            }
        }
    }
    
}
