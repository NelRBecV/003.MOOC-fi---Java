
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int thisOne = this.squares * this.princePerSquare;        
        int another = compared.squares * compared.princePerSquare;        
        return Math.abs(thisOne - another);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisOne = this.squares * this.princePerSquare;
        int thatOne = compared.squares * compared.princePerSquare;
        return thisOne > thatOne;
    }
}
