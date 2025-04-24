public class ReverseString_recursion {
    static String reverse(String st) {
        if (st.isEmpty()) {
            return st;
        }
        return reverse(st.substring(1)) + st.charAt(0);
    }

    public static void main(String[] args) {
        String st = "Hello";
        String result = reverse(st);
        System.out.println("Reverse string is " + result);
    }
}
