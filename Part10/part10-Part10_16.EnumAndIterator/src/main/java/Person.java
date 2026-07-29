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
    private String name;
    private Education studies;
    
    public Person(String personName,Education personDegree){
        this.name = personName;
        this.studies = personDegree;
    }
    
    public Education getEducation(){
        return this.studies;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.studies;
    }
}
