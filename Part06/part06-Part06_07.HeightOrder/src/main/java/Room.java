import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Room {
    private ArrayList<Person> room;
    
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public void add(Person person){
        if(this.room.contains(person)){
            return;
        }
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.room;
    }
    
    public Person shortest(){
        if(this.room.isEmpty()){
            return null;
        }
        Person shortest = this.room.get(0);
        for (Person person: this.room){
            if(person.getHeight()<shortest.getHeight()){
                shortest = person;
            }            
        }
        return shortest;
    }
    
    public Person take(){        
        if(this.room.isEmpty()){
            return null;
        }
        //the code above is redundant due to the shortest function already 
        //check if the list is empty.
        Person shortest = this.shortest();
        this.room.remove(shortest);        
        return shortest;
    }
}
