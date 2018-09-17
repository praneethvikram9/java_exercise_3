import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {

    RemoveVowel temp;

    @Before
    public void setUp() throws Exception {
        temp= new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void vowelPositive(){
        String[] expected = { "Ind" ,"Untd Stts","Grmny","Egypt","czchslvk"};
        String[] a =new String[] {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] result = temp.deleteVowel(a);
        assertArrayEquals(expected,result);
    }
}