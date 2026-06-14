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

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList<>();
    }
    
    public void add(String task){
        if(!task.isBlank()){
            this.list.add(task);
        }
    }
    
    public void remove(int number){   
        //was "or ||" not "and &&"
        if(number < 1 || number > this.list.size()){
            return;
        }
        
        String completed = this.list.get(number);
        this.list.remove(number-1);       
    }
    
    public void print(){        
        if(this.list.size() == 0){
            System.out.println("No tasks available");
        }
        
        for(int n = 0; n < list.size(); n++){
            System.out.println(n+1 + ": " + list.get(n));
        }
    }
}
