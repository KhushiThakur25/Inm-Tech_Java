public class ReplaceCharacters_recursion {
    static String replaceChar(String str, char oldChar, char newChar) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        if (ch == oldChar) {
            ch = newChar;
        }
        return ch + replaceChar(str.substring(1), oldChar, newChar);
    }

    public static void main(String[] args) {
        String st = "banana";
        char oldChar = 'a';
        char newChar = 'x';
        String result = replaceChar(st, oldChar, newChar);
        System.out.println("Replaced string is " + result);
    }
}

