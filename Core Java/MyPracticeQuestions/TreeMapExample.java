import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;


enum Gender {
    MALE, FEMALE, OTHER
}

class Contact {
    private long phoneNumber;
    private String name;
    private String email;
    private Gender gender;

    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Gender: " + gender;
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
  
        TreeMap<Long, Contact> phoneBook = new TreeMap<>(Collections.reverseOrder());

        phoneBook.put(1234567890L, new Contact(1234567890L, "John", "john@example.com", Gender.MALE));
        phoneBook.put(9876543210L, new Contact(9876543210L, "Alice", "alice@example.com", Gender.FEMALE));
       

  
        System.out.println("All Keys:");
        for (Long phoneNumber : phoneBook.keySet()) {
            System.out.println(phoneNumber);
        }

      
        System.out.println("\nAll Values:");
        for (Contact contact : phoneBook.values()) {
            System.out.println(contact);
        }

        System.out.println("\nAll Key-Value Pairs:");
        for (Map.Entry<Long, Contact> entry : phoneBook.entrySet()) {
            Long phoneNumber = entry.getKey();
            Contact contact = entry.getValue();
            System.out.println("Key: " + phoneNumber);
            System.out.println("Value: " + contact);
            System.out.println();
        }
    }
}
