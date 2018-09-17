import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class matrixAdditionTest {

    matrixAddition temp;

    @Before
    public void setUp() throws Exception {
        temp = new matrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void additionPositive(){
        int[][]expected = { {10,10},{10,10},{10,10}};
        int[] a1 =new int[]{1,2,3,4,5,6};
        int[] a2 = new int[]{9,8,7,6,5,4};
        int[][]result=temp.matrixAdd(3,2,a1,a2);
        assertArrayEquals(expected,result);

    }
}