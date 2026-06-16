package application;

public class Todo {
    //Keeps track of the chores from household
    
    private int id;
    private String name;
    private String description;
    private Boolean done;

    public Todo(int id, String name, String description, Boolean done) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public Todo(String name, String description, Boolean done) {
        this(-1, name, description, done);
    }

    //Returns an integer that indicates the number of the task
    public int getId() {
        return id;
    }

    //Assign an integer that represents the number of the task
    public void setId(int id) {
        this.id = id;
    }

    //Get the name of the task
    public String getName() {
        return name;
    }

    //Change the current name with a new one
    public void setName(String name) {
        this.name = name;
    }

    //Returns a string that describes the current taks
    public String getDescription() {
        return description;
    }

    //Inserts a new description or change the current with a new value
    public void setDescription(String description) {
        this.description = description;
    }

    //Returns a boolean which indicates if the task was done or not
    public Boolean getDone() {
        return done;
    }

    //Set the status of a task to 'true' if the task is completed, otherwise sets as 'false'
    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", name=" + name + ", description=" + description + ", done=" + done + '}';
    }

}
