public class Numeric_String {
    public static void main(String[] args) {
        String st = "123@56";
        boolean flag = true;
        for (char ch : st.toCharArray()) {
            if (ch < '0' || ch > '9') {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is numeric string..");
        } else {
            System.out.println("String is not numeric string..");
        }
    }
}
