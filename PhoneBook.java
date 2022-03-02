package JavaCore.HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, String> phoneToName;

    public PhoneBook(){
        this.phoneToName = new HashMap<>();
}
    public void addPhoneName(String name, String phone){
        phoneToName.put(phone, name);
    }
    public ArrayList<String> getPhonesBy(String name) {
        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, String> phoneEntry : phoneToName.entrySet()) {
            if (phoneEntry.getValue().equals(name)) {
                result.add(phoneEntry.getKey());
            }
        }

        return result;
    }
}
