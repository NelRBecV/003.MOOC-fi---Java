package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        
        if(name == null){
            throw new IllegalArgumentException("Null is not a valid name");
        }
        
        if(name.length() > 40){
            throw new IllegalArgumentException("Name characters must be lower than 40");
        }        
        
        if(name.isBlank()){
            throw new IllegalArgumentException("No name has been introduced");
        }
        this.name = name;        
        
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be greater than 0"
                                                + " and lower than 120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
