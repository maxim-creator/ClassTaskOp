import org.junit.Test;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

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
    public void testIsPalindrome() {
        assertTrue(main.isPalindrome("qwwq"));
        assertFalse(main.isPalindrome("qwe"));
    }

    @Test
    public void testFileLength() {
        Scanner scanner = new Scanner("input.txt");
        int len = 0;
        while (scanner.hasNext()){
            len++;
            scanner.nextLine();
        }
        if(len<=100)
            assertTrue(true);
        else
            assertTrue(false);
    }

    @Test
    public void testWriteAnswer(){
         main.writeAnswer(5);
         Scanner scanner = new Scanner("answer.txt");
         assertEquals(5, scanner.nextInt());
    }

}
