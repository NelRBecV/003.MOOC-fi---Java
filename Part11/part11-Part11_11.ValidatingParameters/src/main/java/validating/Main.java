/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validating;

/**
 *
 * @author Yo
 */
public class Main {
    public static void main(String[] args){
        //Person with name greater than 40 characters
        Person longName = new Person("hsdkadñawdñadñakdñaksdñkasñdañsldkasdret",40);
        //Person with no name
        //Person johnDoe = new Person("",0);
        //Person with null name
        //Person nullName = new Person(null,20);
        //Person with age lesser than 0
        //Person negative = new Person("mike",-20);
        //Person with age greater than 120
        //Person olderThan40 = new Person("joe",220);
        Person rightPerson = new Person("Tom",45);
        
        Calculator calc = new Calculator();
        
        //factorial lesser than 0
        //calc.factorial(-100);
        calc.factorial(5);
        //binominalCoeficient setSize whit negative value
        //calc.binomialCoefficent(-10, 10);
        //binominalCoeficient subsetSize whit negative value
        //calc.binomialCoefficent(10, -10);
        //binominalCoeficient subsetSize greater than subSize
        //calc.binomialCoefficent(10, 100);
        calc.binomialCoefficent(15, 5);
    }
}
