
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String outcome = "The collection " + this.name +" ";        
        if(this.elements.isEmpty()){
            outcome += "is empty.";
            return outcome;
        }
        String s = "";
        if(this.elements.size() > 1){
            s = "s";            
        }
        outcome += "has " + this.elements.size() + " element" + s +":";
        for (String element:this.elements){
            outcome += "\n" + element;
        }
        return outcome;
    }
}
