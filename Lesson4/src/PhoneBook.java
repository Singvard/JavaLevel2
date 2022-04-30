import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    HashMap<String, String> hm= new HashMap<>();

    public PhoneBook(HashMap<String, String> hm) {
        this.hm = hm;
    }

    public void add(String mobilePhone, String lastName) {
        hm.put(mobilePhone, lastName);
    }

    public void get(String lastName) {
        for (Map.Entry entry: hm.entrySet()) {
            if (entry.getValue() == lastName) {
                System.out.println(entry.getValue() + ": " + entry.getKey());
            }
        }
    }
}
