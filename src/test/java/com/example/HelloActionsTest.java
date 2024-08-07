import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class HelloActionsTest {
  @Test
  public void testHelloActions() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    HelloActions.main(new String[] {});
    // assertEquals(1, 1);
    // assertEquals("Hello, GitHub Actions!\n", outContent.toString());
    assertEquals("Hello, GitHub Actions!", HelloActions.sayHello());
    System.setOut(System.out);
  }
}
