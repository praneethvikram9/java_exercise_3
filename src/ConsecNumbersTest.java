import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecNumbersTest {

    ConsecNumbers temp;

    @Before
    public void setUp() throws Exception {
        temp = new ConsecNumbers();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }
    @Test

    public void consecTestPositive(){
        String expected = "numbers given are not consecutive";
        String result = temp.checkConsecNumbers("98,96,95,94,92,91");
        assertEquals(expected,result);
    }
}