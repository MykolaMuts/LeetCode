package problems.java.hashmap;

import java.util.*;

public class WordPattern290 {

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> patterns = new HashMap<>();

        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char letter = pattern.charAt(i);

            String word = words[i];

            if(patterns.containsKey(letter)){
                if(!patterns.get(letter).equals(word)){
                    return false;
                }
            } else {
                if(patterns.containsValue(word)){
                    return false;
                } else {
                    patterns.put(letter,word);
                }
            }



        }

        return true;
    }


    public boolean wordPatternCooler(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}
