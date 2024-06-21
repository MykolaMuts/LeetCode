package problems.java.hashmap;

import java.util.HashMap;

public class RansomNote383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<String, Integer> letters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            String currentMagLetter = String.valueOf(magazine.charAt(i));

            letters.put(currentMagLetter,
                    letters.getOrDefault(currentMagLetter, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            String currentLetter = String.valueOf(ransomNote.charAt(i));

            if (!letters.containsKey(currentLetter)) {
                return false;
            } else {
                if (letters.get(currentLetter) == 0) {
                    return false;
                }
                letters.replace(currentLetter, letters.get(currentLetter) - 1);
            }

        }

        return true;
    }
}

