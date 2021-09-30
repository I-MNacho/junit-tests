import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class StudentTest {

    private Student stu1;


    @Before
    public void setup(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        grades.add(90);

        stu1 = new Student(1657312122, "Nacho",  grades);
        stu2 = new Student(1657312122, "Nacho",  grades);

    }

    @Test
    public void testGetId() {
        assertEquals(stu1.id, stu1.getId());
        assertEquals(, stu1.getId());
    }








}