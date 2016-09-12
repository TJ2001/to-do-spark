import org.junit.*;
import static org.junit.Asser.*;

public class TaskTest {
  @TaskTestpublic void Task_instantiatesCorrectly_true() {
    Task myTask = new Tas("Mow the Lawn");
    assertEquals(true, myTask instanceof Task);
  }
}
