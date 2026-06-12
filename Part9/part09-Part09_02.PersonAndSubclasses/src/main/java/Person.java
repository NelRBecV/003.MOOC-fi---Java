/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Person {
    private String fullName;
    private String personAddress;
    
    public Person(String name, String address){
        this.fullName = name;
        this.personAddress = address;
    }
    
    public String toString(){
        return fullName + "\n  " + personAddress;
    }
}
