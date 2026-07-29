
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare mySquare = msFactory.createMagicSquare(9);
        
        System.out.println(mySquare);
        System.out.println(mySquare.isMagicSquare());
        System.out.println(mySquare.sumsAreSame());
        System.out.println(mySquare.allNumbersDifferent());
        System.out.println("");
        System.out.println(mySquare.sumsOfRows());
        System.out.println(mySquare.sumsOfColumns());
        System.out.println(mySquare.sumsOfDiagonals());
        
        
    }
}
