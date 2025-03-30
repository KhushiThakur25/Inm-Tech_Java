public class ReverseString {
    public static void main(String[] args) {
        String st = "abbcbb";
        char[] arr = st.toCharArray();

        // String result = "";
        // for (char ch : arr) {
        // System.out.print(ch + " ");
        // result = ch + result;
        // }
        // System.out.println(result);

        // if (st.equals(result)) {
        // System.out.println("String is palindrome..");
        // } else {
        // System.out.println("String is not palindrome..");
        // }

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String s = new String(arr);
        System.out.println(s);
    }
}
