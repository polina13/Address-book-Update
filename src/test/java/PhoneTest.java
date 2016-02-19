import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PhoneTest {

  @Rule
  public ClearRule  clearRule = new ClearRule();

  @Test
  public void phone_instatiatesCorrectly() {
    Phone testPhone = new Phone("home", "503", "111-1111");
    assertEquals(true, testPhone instanceof Phone);
  }
