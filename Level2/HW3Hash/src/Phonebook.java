import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private Map<String, HashSet<String>>map;

    Phonebook(){
        this.map=new HashMap<>();
    }

    void add(String lastName,String number){
        HashSet<String>numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(number);
        map.put(lastName,numbers);
    }
    Set<String> get(String lastName) {
        return map.get(lastName);
    }


}
