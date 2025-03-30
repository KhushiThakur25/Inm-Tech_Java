import java.util.HashMap;

public class Remove_duplicates_STRING {
    public static void main(String[] args) {
        String st = "programming";
        String result = "";
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char ch : st.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, true);
                result += ch;
            }
        }
        System.out.println(result);
    }
}
