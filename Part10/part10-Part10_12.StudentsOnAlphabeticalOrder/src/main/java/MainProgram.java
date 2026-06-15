import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo3");
        Student second = new Student("Jamo2");
        Student third = new Student("hami");
        List<Student> students = new ArrayList();
        
        students.add(first);
        students.add(second);
        students.add(third);        
        
        Collections.sort(students);
        
        System.out.println(students);
    }
}
