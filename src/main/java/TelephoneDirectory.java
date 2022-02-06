import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TelephoneDirectory {
    private Map<String, List<String>> telephonedirectory_hm = new HashMap<>();
    private List<String> phone_numberL;

    public void add(String surname, String phone_number) {
        if (telephonedirectory_hm.containsKey(surname)) {
            phone_numberL = telephonedirectory_hm.get(surname);
            phone_numberL.add(phone_number);
            telephonedirectory_hm.put(surname, phone_numberL);
        } else {
            phone_numberL = new ArrayList<>();
            phone_numberL.add(phone_number);
            telephonedirectory_hm.put(surname, phone_numberL);
        }
    }

    public List<String> get(String surname) {
        return telephonedirectory_hm.get(surname);
    }
}
