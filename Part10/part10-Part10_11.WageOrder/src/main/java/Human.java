public class Human implements Comparable<Human>{
    private String humanName;
    private int humanWage;
    
    public Human(String name, int wage){        
        this.humanName = name;
        this.humanWage = wage;
    }
    
    public String getName(){
        return this.humanName;
    }
    
    public int getWage(){
        return this.humanWage;
    }
    
    @Override
    public String toString(){
        return this.humanName + " " + this.humanWage;
    }    
    
    @Override
    public int compareTo(Human otherHuman){
        return otherHuman.getWage() - this.humanWage;
    }
    
}