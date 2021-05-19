package TimeTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message;
    MessageUtil messageUtil;

    @Before
    public void initialize(){
        message = "Robert";
        messageUtil = new MessageUtil(message);
    }

    @Test(timeout = 1000)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
