
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation ambulatorio = new HealthStation();
        
        Person robinson = new Person("Robinson",12,85,35);
        Person antonio = new Person("Antonio",10,80,55);
        Person julio = new Person("Julio", 11, 83,60);
        Person carlos = new Person("Carlos", 10,86,68);
        
        System.out.println("weighings performed: " + ambulatorio.weighings());
        System.out.println(robinson.getName() + " weight: " + robinson.getWeight() + " kilos");
        System.out.println(antonio.getName() + " weight: " + antonio.getWeight() + " kilos");
        System.out.println(julio.getName() + " weight: " + julio.getWeight() + " kilos");
        System.out.println(carlos.getName() + " weight: " + carlos.getWeight() + " kilos");
        
        ambulatorio.feed(carlos);
        ambulatorio.feed(julio);
        
        System.out.println("weighings performed: " + ambulatorio.weighings());
        System.out.println(robinson.getName() + " weight: " + robinson.getWeight() + " kilos");
        System.out.println(antonio.getName() + " weight: " + antonio.getWeight() + " kilos");
        System.out.println(julio.getName() + " weight: " + julio.getWeight() + " kilos");
        System.out.println(carlos.getName() + " weight: " + carlos.getWeight() + " kilos");
    }
}
