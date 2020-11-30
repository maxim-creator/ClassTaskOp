import org.junit.Test;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestProg {
    Main main = new Main();

    @Test
    public void testReadData() throws FileNotFoundException {
        Main main = new Main();
        List<String> test = main.readData("test.txt");
        List<String> test2 = new ArrayList<>();
        {
            test2.add("qwe");
        }
        assertEquals(test2, test);
    }

    @Test
    public void testSearchBiggestPalindrome() {
        List<String> data = new ArrayList();
        {
            data.add("qw wq");
        }
        assertEquals(5, main.searchBiggestPalindrome(data));
    }

    @Test
    public void testIsPalindrome(){
        assertTrue(main.isPalindrome("qwwq"));
    }

}
