
public class MainProgram {
        
    public static void main(String[] args) {
        // test your classes here        
        final Education[]degrees = {Education.PHD,Education.MA,Education.BA,Education.HS};
        Employees payroll = new Employees();
                
        for (int i=0;i<10;i++){                        
            payroll.add(new Person("Person "+(i+1),degrees[(int) (Math.random()*4)]));
        }
        
        payroll.print();
        
        
        payroll.print(Education.BA);
        
        payroll.fire(Education.BA);
        payroll.print();
    }
}
