
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public String toString(){
        return this.name + ", published in " + this.publicationYear;
    }
    public boolean equals(Object bookObject){
        if (this == bookObject){
            return true;
        }
        if (!(bookObject instanceof Book) || (bookObject == null)){
            return false;
        }
        
        Book book = (Book) bookObject;
        
        if (!(book.name.equals(this.name) && book.publicationYear == this.publicationYear)){
           return false; 
        }
        return true;
    }

}
