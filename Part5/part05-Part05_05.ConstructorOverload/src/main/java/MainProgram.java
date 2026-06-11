
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product milk = new Product("Tachira","Dairy",250);
        Product honey = new Product("DelPanal");
        Product butter = new Product("Mavesa",500);
        Product peas = new Product("DelMonte","vegetables");        
        
        Product[] inventory = {milk,honey,butter,peas};
        for (Product product: inventory){
            System.out.println(product);
        }
    }
}
