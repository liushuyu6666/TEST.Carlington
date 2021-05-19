package ExceptionsTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = NullPointerException.class)
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
