package problems.java.hashmap;

import java.util.*;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> maps = new ArrayList<>();

        PARENT_LOOP:
        for (String str : strs) {
            for (List<String> map : maps) {
                if (isAnagram(map.getFirst(), str)) {
                    map.add(str);
                    continue PARENT_LOOP;
                }
            }
            maps.add(new ArrayList<>(Collections.singletonList(str)));
            // need to use singletonList because it is not fixed size
        }

        return maps;

    }


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
