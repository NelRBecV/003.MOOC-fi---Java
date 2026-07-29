
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void advance(int days){        
        int i = 0;
        while(i < days){            
            this.advance();
            i++;
        }
    }
    
    public void advance(){
        this.day++;
        if(this.day>30){
            this.month++;
            if(this.month > 12){
                this.year++;
                this.month -=12;
            }
            this.day -= 30;
        }
    }    
    
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);
        newDate.advance(days);
        return newDate;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
