package linear_data_structures.Map;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();

        String str = "a green apple";

       /* for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        } */

        for (char ch : str.toCharArray()) {
            int count = map.getOrDefault(ch,0);
            map.put(ch, count + 1);
        }

        System.out.println(map);
        for (char c : str.toCharArray()){
            if (map.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }
}
