import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<String>> hm = new HashMap<>();

    public void add(String lastName, String mobilePhone) {
        ArrayList<String> tmp;
        if (hm.containsKey(lastName)) {
            tmp = hm.get(lastName);
            tmp.add(mobilePhone);
            hm.put(lastName, tmp);
        } else {
            tmp = new ArrayList<>();
            tmp.add(mobilePhone);
            hm.put(lastName,tmp);
        }
    }

    public void get(String lastName) {
        String resultStr = "";
        if (hm.containsKey(lastName)) {
            ArrayList<String> result = new ArrayList<>(hm.get(lastName));
            resultStr += "Фамилии " + lastName + " сотвествует:\n";
            for (String s : result) {
                resultStr += s + "\n";
            }
        } else {
            resultStr = "Абонент " + lastName + " не найден\n";
        }
        System.out.println(resultStr);
    }
}
