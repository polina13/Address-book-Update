
import java.util.ArrayList;


public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();


  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private int mId;
  // private static ArrayList<Phone> mPhone;

  public Contact (String firstName, String lastName,
  String birthMonth) {
    mFirstName = firstName;
    mLastName = lastName;
    mBirthMonth = birthMonth;
    instances.add(this);
    mId = instances.size();
    // mPhone = new ArrayList<Phone>();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public String getBirthMonth() {
    return mBirthMonth;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
     instances.clear();
   }

  public static Contact find(int id) {
  try {
    return instances.get(id - 1);
  } catch (IndexOutOfBoundsException exception) {
    return null;
    }
  }

   public static ArrayList<Contact> all() {
     return instances;
   }
 }
