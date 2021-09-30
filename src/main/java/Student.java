import java.util.ArrayList;

public class Student {

    //variables
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    //constructor
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){

    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){

        return null;
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        return 0;
    }

}
