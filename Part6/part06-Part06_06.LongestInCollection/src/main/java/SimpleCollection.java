
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
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        int[] longest = {0,0};
        for (String element:this.elements){
            if(element.length() > longest[0]){
                longest[0] = element.length();
                longest[1] = this.elements.indexOf(element);                
            }
        }
        return this.elements.get(longest[1]);
    }
}
