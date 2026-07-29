/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yo
 */
public class Person implements Saveable{
    private String name;
    private String address;
    
    @Override
    public void save(){
        System.out.println("Saved");
    }
    
    @Override
    public void delete(){
        System.out.println("Deleted");
    }
    
    @Override
    public void load(String address){
        System.out.println(address);
    }
}
