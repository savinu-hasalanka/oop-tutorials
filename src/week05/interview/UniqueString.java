package week05.interview;

public class UniqueString {
    public static void main(String[] args) {
        String s1 = "john";
        String s2 = "anne";
        System.out.println(isUnique(s1) ? "Unique" : "Not unique");
        System.out.println(isUnique(s2) ? "Unique" : "Not unique");

    }
    // Time Complexity : O(n**2)
    // as every character is compared with all subsequent characters.

    // Space Complexity : O(1)
    // as no additional data structures are used, only the original string.
    public static boolean isUnique(String s) {
        int length = s.length();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
