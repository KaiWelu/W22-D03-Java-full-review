import com.omar.Main;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main mainInstance;

    @BeforeEach
    public void setUp(){
        mainInstance = new Main();
    }


    @Test
    @Disabled
    public void addingTwoNumbers(){
        int num1 = 10;
        int num2 = 20;
        int actualOutput = mainInstance.add(num1,num2);
        int expectedOutput = 30;

       assertEquals(actualOutput,expectedOutput);
    }


    public void showAsserts(){
        assertNotEquals(10,20);
        assertFalse(false);
        assertTrue(true);
        assertNull(null);
        assertNotNull("value");
        assertNotSame("1","2");
    }



}
