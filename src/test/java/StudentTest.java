import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class StudentTest {

    private Student student1;


    @Before
    public void setup(){
        //create an array
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        grades.add(90);

// new ArrayList<Integer>(List.of(50, 75, 100));     //<--can have in place of grades down below
        student1 = new Student(1657312122, "Nacho",  grades);
    }

    @Test
    public void testGetId() {
        assertEquals(student1.id, student1.getId());
    }

    @Test
    public void testGetName(){
        assertEquals(student1.name, student1.getName());
    }

    @Test
    public void testAddGrade(){
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(80);
        grades1.add(90);
        assertEquals(grades1, student1.getGrades());

        grades1.add(70);
        student1.addGrade(70);

        assertEquals(grades1, student1.getGrades());
    }


    @Test
    public void testGetGrades(){


    }



}