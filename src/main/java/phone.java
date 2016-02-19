import java.util.ArrayList;


public class Phone {
  private static ArrayList<Phone> instances = new ArrayList<Phone>();
//

  private String mPhoneType;
  private String mAreaCode;
  private String mPhoneNumber;
  private int mId;
  // private static ArrayList<Phone> mPhone;
//
  public Phone (String phoneType, String areaCode,
  String phoneNumber) {
      mPhoneType = phoneType;
      mAreaCode = areaCode;
      mPhoneNumber = phoneNumber;
//     mFirstName = firstName;
//     mLastName = lastName;
//     mBirthMonth = birthMonth;
//     instances.add(this);
//     mId = instances.size();
//     // mPhone = new ArrayList<Phone>();
//   }
//
//   public String getFirstName() {
//     return mFirstName;
//   }
//
//   public String getLastName() {
//     return mLastName;
//   }
//
//   public String getBirthMonth() {
//     return mBirthMonth;
//   }
//
//   public int getId() {
//     return mId;
//   }
//
//   public static void clear() {
//      instances.clear();
//    }
//
//   public static Phone find(int id) {
//   try {
//     return instances.get(id - 1);
//   } catch (IndexOutOfBoundsException exception) {
//     return null;
//     }
//   }
//
//    public static ArrayList<Phone> all() {
//      return instances;
//    }
//  }
