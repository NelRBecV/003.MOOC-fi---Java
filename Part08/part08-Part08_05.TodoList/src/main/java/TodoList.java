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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        if(task.isBlank()){
            return;
        }
        this.list.add(task);
    }
    
    public void remove(int index){
        int task = index - 1;
        
        if (task <= this.list.size()){            
            this.list.remove(task);
        }
    }
    
    public void print(){        
        for (int task = 0; task < this.list.size(); task++){
            System.out.println(task + 1 + ": "  + this.list.get(task));
        }
    }    
    
    
}
