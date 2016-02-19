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

  @Test
    public void getId_returnsContactId() {
      Contact testContact = new Contact("test","test2", "May");
      assertTrue(Contact.all().size() == testContact.getId());

    }

    @Test
    public void all_returnsAllContacts_true() {
    Contact firstContact = new Contact("test", "test2", "May");
    Contact secondContact = new Contact("test3", "test4", "June");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
    }


    @Test
    public void newId_contactsInstantiateWithAnID_true() {
      Contact testContact = new Contact("test", "test2", "May");
      assertEquals(Contact.all().size(), testContact.getId());
    }

    @Test
    public void find_returnsContactkWithSameId_secondContact() {
      Contact firstContact = new Contact("test", "test2", "May");
      Contact secondContact = new Contact("test3", "test4", "June");
      assertEquals(Contact.find(secondContact.getId()), secondContact);
    }

    @Test
    public void clear_removesAllContactInstancesFromMemory() {
      Contact testContact = new Contact("test", "test2", "May");
      Contact.clear();
      assertEquals(Contact.all().size(), 0);
    }
    //
    // @Test
    // public void addTask_addsTaskToList() {
    //   Category testCategory = new Category("Bob's Used Tasks");
    //   Task testTask = new Task("Mow the lawn");
    //   testCategory.addTask(testTask);
    //   assertTrue(testCategory.getTasks().contains(testTask));
    // }
}
