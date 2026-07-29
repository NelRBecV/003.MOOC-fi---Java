
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack stackList = new Stack();
        
        System.out.println("Empty: " + stackList.isEmpty());
        System.out.println(stackList);
        System.out.println("");
        stackList.add("Hola");
        /*stackList.add("mundo");
        stackList.add("cómo");
        stackList.add("estás");*/
        
        System.out.println("Empty: " + stackList.isEmpty());
        System.out.println(stackList);
        System.out.println("");
        stackList.take();
        stackList.take();
        
        System.out.println("Empty: " + stackList.isEmpty());
        System.out.println(stackList);
        
    }
}
