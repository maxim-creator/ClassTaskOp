import org.junit.Test;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestProg {
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

}
