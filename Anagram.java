import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silents";

        if (s.length() == t.length()) {
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String newS = new String(arr1);
            String newT = new String(arr2);
            System.out.println(newS + " " + newT);
            if (newS.equals(newT)) {
                System.out.println("They are anagram of each other..");
            } else {
                System.out.println("They aren't anagram of each other..");
            }
        } else {
            System.out.println("They are of different size that's why ,they aren't anagram..");
        }
    }
}
