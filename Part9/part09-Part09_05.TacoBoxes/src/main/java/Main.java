public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tripleTacos = new TripleTacoBox();
        CustomTacoBox custom1 = new CustomTacoBox(10);
        CustomTacoBox custom2 = new CustomTacoBox(5);
        CustomTacoBox custom3 = new CustomTacoBox(2);
        
        CustomTacoBox[] tacoBoxes = {custom1, custom2, custom3};
        
        for (CustomTacoBox box : tacoBoxes){
            for(int taco=0; taco < 2; taco++){
                box.eat();
            }
        }
        
        for (int box = 0; box < tacoBoxes.length; box++){
            System.out.println("Tacos remaining in custom"+(box+1)+": "+ tacoBoxes[box].tacosRemaining());
        }
        
    }
}
