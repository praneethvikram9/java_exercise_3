import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks temp;

    @Before
    public void setUp() throws Exception {
        temp = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void gradeTestPositive(){
        String expected = "please enter grade in between 0 and 100";
        String result=temp.Gradecheck(-2);
        assertEquals(expected,result);
    }


    @Test

    public void gradeTest1Positive(){
        String expected = "entered correct input";
        String result=temp.Gradecheck(97);
        assertEquals(expected,result);
    }



}