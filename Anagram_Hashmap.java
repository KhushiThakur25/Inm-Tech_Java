import java.util.HashMap;
import java.util.Map;

public class Anagram_Hashmap {
    static boolean anagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (anagram(s, t)) {
            System.out.println("String is an anagram");
        } else {
            System.out.println("String not an anagram..");
        }

    }
}
