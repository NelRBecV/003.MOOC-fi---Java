
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String txtFile = scanner.nextLine();        
        ArrayList<Recipes> recipe = new ArrayList<>();
        
        try{            
            File fileObj = new File(txtFile);
            Scanner dataFile = new Scanner(fileObj);
            String data = "";
            while (dataFile.hasNextLine()){                
                data += dataFile.nextLine().strip()+",";                                                  
            }
            data += " ";
            String[] fileContent = data.split(",");
            ArrayList<String>recipeElements = new ArrayList<>();
            for (String content : fileContent){               
                if (content.isBlank()){                    
                    String name = recipeElements.get(0);
                    int time = Integer.valueOf(recipeElements.get(1));
                    ArrayList<String>ingredients = new ArrayList<>();
                    
                    for(int i = 2; i < recipeElements.size();i++ ){
                        ingredients.add(recipeElements.get(i));
                    }                    
                    recipe.add(new Recipes(name,time,ingredients));
                    recipeElements.clear();
                    continue;
                }
                recipeElements.add(content);           
            }
            
        } catch(Exception e){
            System.out.println("Error: " + e);
        }        
        if (!recipe.isEmpty()){
            RecipesProgramInterface userInterface = new RecipesProgramInterface(scanner, recipe);
            userInterface.commandsMenu();
            userInterface.startProgram();
        }
    }

}
