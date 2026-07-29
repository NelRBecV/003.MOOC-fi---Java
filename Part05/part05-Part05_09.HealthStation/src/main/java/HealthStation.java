
import java.util.HashSet;
import java.util.Set;


public class HealthStation {

    private int weightCount;
    
    public HealthStation(){
        this.weightCount = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter        
        this.weightCount++;
        return person.getWeight();        
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
        
    }
    public int weighings(){
        return this.weightCount;
    }
}
