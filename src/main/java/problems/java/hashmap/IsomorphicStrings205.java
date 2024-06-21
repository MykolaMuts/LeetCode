package problems.java.hashmap;

import java.util.HashMap;
import java.util.Objects;

public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {

        HashMap<String, String> letters = new HashMap<>();

        StringBuilder word = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            String original = String.valueOf(s.charAt(i));
            String replaceable = String.valueOf(t.charAt(i));

            if(letters.containsKey(original) && !letters.containsValue(replaceable)){
                return false;
            }

            if(!letters.containsKey(original) && letters.containsValue(replaceable)){
                return false;
            }

            letters.putIfAbsent(original, replaceable);

            word.append(letters.get(original));

        }

        return word.toString().equals(t);

    }

}
