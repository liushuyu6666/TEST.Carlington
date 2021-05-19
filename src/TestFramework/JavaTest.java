package TestFramework;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
    private int value1, value2;

    protected void setUp(){
        value1 = 3;
        value2 = 4;
    }

    public void testGame(){
        int result = value1 + value2;
        assertTrue(result == 7);
    }
}
