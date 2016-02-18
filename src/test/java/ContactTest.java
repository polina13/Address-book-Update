import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ContactTest {

  @Rule
  public ClearRule  clearRule = new ClearRule();

  @Test
  public void contact_instatiatesCorrectly() {
    Contact testContact = new Contact("test", "test2", "May");
    assertEquals(true, testContact instanceof Contact);
  }

  @Test
  public void getFirstName_returnsFirstName_test() {
    Contact testContact = new Contact("test", "test2", "May");
    assertEquals("test", testContact.getFirstName());
  }

  @Test
  public void getLastName_returnsLastName_test2() {
    Contact testContact = new Contact("test", "test2", "May");
    assertEquals("test2", testContact.getLastName());
  }

  @Test
  public void getBirthMonth_returnsBirthMonth_May() {
    Contact testContact = new Contact("test", "May", "May");
    assertEquals("May", testContact.getBirthMonth());
  }


}
