
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {        
        String file = "literacy.csv";        
        try {
            Files.lines(Paths.get(file))
                    .map(data1 -> data1.split(","))
                    .map(m -> new String[] {m[2],m[3],m[4],m[5]})                    
                    .sorted((p,q) -> p[3].compareTo(q[3]))
                    //.sorted((p,q) -> Double.parseDouble(p[3]) - Double.parseDouble(q[3]))
                    .map(n -> n[1]+" ("+n[2]+"), "+n[0].replace("(%)", "").trim()+", "+n[3])
                    .forEach(record -> System.out.println(record));
                    
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage() + " not found or can't read");
        }       
        
    }
}
