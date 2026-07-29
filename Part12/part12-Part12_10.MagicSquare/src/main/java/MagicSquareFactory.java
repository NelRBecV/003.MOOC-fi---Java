
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int totalNums = square.getHeight() * square.getWidth();
        int x = (int) size / 2;
        int y = 0;                        
        
        for(int num = 1; num <= totalNums; num++){                       
            int newX = x;
            int newY = y;
            boolean put = false;
            while (!put){                
                if (square.readValue(newX, newY) == 0){                         
                    square.placeValue(newX, newY, num);                    
                    put = true;
                    
                } else {                    
                    if (square.readValue(newX,newY) == -1){
                        newX = square.resetValue(newX);
                        newY = square.resetValue(newY);                
                    } else if (square.readValue(newX, newY)> 0){                
                        newY = square.resetValue(y + 2);
                        newX = square.resetValue(x - 1);
                    }

                }
            }
            x = newX + 1;
            y = newY - 1;
        }       
        
        return square;
    }   
     
    

}
