import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;
    private ArrayList<String> completedExercises;

    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
        this.completedExercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: this.exercises){
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise){
        for (Exercise exer:this.exercises){
            if(exer.getName().equals(exercise)){
                exer.setCompleted(true);
            }
        }        
    }
    
    public boolean isCompleted(String exercise){
        for (Exercise exer:this.exercises){
            if(exer.getName().equals(exercise)){
                return exer.isCompleted();
            }
        }
        return false;
    }
}
