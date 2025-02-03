package linear_data_structures.Map;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();

        String str = "a green apple";

        for (char ch : str.toCharArray()) {
            int count = map.getOrDefault(ch,0);
            map.put(ch, count + 1);
        }

        Queue<Integer> q  = new ArrayDeque<>();
        q.poll();
        System.out.println(map);
        for (char c : str.toCharArray()){
            if (map.get(c) > 1){
                System.out.println(c);
                break;
            }
        }
    }
}
