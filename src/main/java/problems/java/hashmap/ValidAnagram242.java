package problems.java.hashmap;

import java.util.HashMap;

public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> letters = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            letters.compute(s.charAt(i),
                    (k, v) -> (v == null) ? 1 : v + 1);

        }

        for (int i = 0; i < t.length(); i++) {

            if(letters.compute(t.charAt(i), (k, v) -> (v == null) ? -1 : v- 1) == -1){
                return false;
            }

        }

        return true;

    }
}
