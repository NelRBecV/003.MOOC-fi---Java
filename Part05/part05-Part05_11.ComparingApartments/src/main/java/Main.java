
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        Apartment a1 = new Apartment(1,20,1000);
        Apartment a2 = new Apartment(2,30,2000);
        
        System.out.println(a1.priceDifference(a2));
        /*System.out.println("Larger than:");
        System.out.println("Manhattan's Apartment larger than Atlanta's; " + manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println("Manhattan's Apartment larger than Bangor's; " + manhattanStudioApt.largerThan(bangorThreeBedroomApt));
        System.out.println("Atlanta's Apartment larger than Bangor's; " + manhattanStudioApt.largerThan(bangorThreeBedroomApt));
        
        System.out.println("");
        
        System.out.println("Price Difference: ");
        System.out.println("Manhattan and Atlanta's price difference: " + manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println("Manhattan and Bangor's price diference: " + manhattanStudioApt.priceDifference(bangorThreeBedroomApt));
        System.out.println("Atlanta and Bangor's price diffrence: " + atlantaTwoBedroomApt.priceDifference(bangorThreeBedroomApt));
        
        System.out.println("");
        
        System.out.println("More Expensive: ");
        System.out.println("Manhattan and Atlanta's more expensive: " + manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println("Manhattan and Bangor's more expensive: " + manhattanStudioApt.moreExpensiveThan(bangorThreeBedroomApt));
        System.out.println("Atlanta and Bangor's more expensive: " + atlantaTwoBedroomApt.moreExpensiveThan(bangorThreeBedroomApt));*/
    }
}
