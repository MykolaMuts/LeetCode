package problems.java;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber17 {

    public static HashMap<String, String[]> getPhoneMap() {

        HashMap<String, String[]> phoneMap = new HashMap<>();

        phoneMap.put("2", new String[]{"a", "b", "c"});
        phoneMap.put("3", new String[]{"d", "e", "f"});
        phoneMap.put("4", new String[]{"g", "h", "i"});
        phoneMap.put("5", new String[]{"j", "k", "l"});
        phoneMap.put("6", new String[]{"m", "n", "o"});
        phoneMap.put("7", new String[]{"p", "q", "r", "s"});
        phoneMap.put("8", new String[]{"t", "u", "v"});
        phoneMap.put("9", new String[]{"w", "x", "y", "z"});

        return phoneMap;
    }

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }


        HashMap<String, String[]> phoneMap = getPhoneMap();

        String[] digitsArray = digits.split("");


        List<String> currentRes = new ArrayList<>();


        Collections.addAll(currentRes, phoneMap.get(digitsArray[0]));

        for (int i = 1; i < digitsArray.length; i++) {

            List<String> result = new ArrayList<>();

            for (String letter : phoneMap.get(digitsArray[i])) {
                for (String re : currentRes) {

                    result.add(re + letter);
                }
            }

            currentRes = result;
        }
        return currentRes;
    }


    public List<String> letterCombinationsStream(String digits) {

        List<String> res = new ArrayList<>();

        HashMap<String, String[]> letters = getPhoneMap();

        String[] digitsArray = digits.split("");

        return Arrays.stream(digitsArray)
                .map(letters::get)
                .filter(Objects::nonNull)
                .reduce((arr1, arr2) -> {
                    // Perform combination of two arrays
                    return Arrays.stream(arr1)
                            .flatMap(letter1 -> Arrays.stream(arr2).map(letter2 -> letter1 + letter2))
                            .toArray(String[]::new);
                })
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }

}
