/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Yo
 */
public class Employees {
    private List<Person>employees;
    
    public Employees(){
        this.employees = new ArrayList();
    }
    
    public void add(Person employee){
        this.employees.add(employee);
    }
    
    public void add(List<Person> employees){
        this.employees = employees;
    }
    
    public void print(){
        Iterator<Person> iter = this.employees.iterator();
        StringBuilder output = new StringBuilder();
        
        while(iter.hasNext()){
            output.append(iter.next()+"\n");            
        }
        
        System.out.println(output);
    }
    
    public void print(Education degree){
        Iterator<Person> iterEmployees = this.employees.iterator();
        StringBuilder output = new StringBuilder();
        
        while(iterEmployees.hasNext()){
            Person employee = iterEmployees.next();            
            
            if(employee.getEducation() == degree){
                output.append(employee+"\n");
            }
        }
        System.out.println(output);
    }
    
    public void fire(Education education){
        Iterator<Person> payroll = this.employees.iterator();        
        while(payroll.hasNext()){
            Person employee = payroll.next();
            if(employee.getEducation() == education){
                payroll.remove();
            }
        }
        
    }
}
