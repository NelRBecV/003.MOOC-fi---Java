

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("The Lord of the Rings: The Two Towers",1);
        Item jean = new Item("Wrangler",1);
        Item recorder = new Item("recorder", 2);
        Item shampoo = new Item("Head&Shoulders",1);
        
        Suitcase case1 = new Suitcase(2);
        Suitcase case2 = new Suitcase(2);
        Suitcase case3 = new Suitcase(2);
        case1.addItem(book);
        case1.addItem(jean);
        case2.addItem(recorder);
        case3.addItem(shampoo);        
        
        System.out.println("Printing items from Suitcase");
        case1.printItems();
        System.out.println("");
        case2.printItems();
        System.out.println("");
        case3.printItems();
        
        Hold container = new Hold(10);               
        container.addSuitcase(case1);
        container.addSuitcase(case2);
        container.addSuitcase(case3);
        System.out.println("");
        
        System.out.println("Printing suitcases from Hold");
        container.printItems();
        
        
    }

}
