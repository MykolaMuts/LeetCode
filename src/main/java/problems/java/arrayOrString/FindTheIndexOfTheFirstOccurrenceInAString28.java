package problems.java.arrayOrString;

public class FindTheIndexOfTheFirstOccurrenceInAString28 {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            System.out.println(haystack.substring(i).length());
            if (haystack.substring(i).length() >= needle.length()) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStrFatherLoop(String haystack, String needle) {

        if(haystack.length() < needle.length()) return -1;

        int left, right;

        for (left = 0; left < haystack.length(); left++) {
            FATHER_LOOP:
            if (haystack.charAt(left) == needle.charAt(0)) {
                for (right = left; right - left < needle.length(); right++) {
                    if(right >= haystack.length()){
                        return -1;
                    }
                    if (haystack.charAt(right) != needle.charAt(right - left)) {
                        break FATHER_LOOP;
                    }
                }
                return left;
            }
        }
        return -1;
    }


}
