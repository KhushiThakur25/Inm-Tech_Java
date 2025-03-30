public class Vowels_Count {
    public static void main(String[] args) {
        String st = "Wow users,see Taj Mahal";
        st = st.toLowerCase();
        int count = 0;
        for (char ch : st.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
           
        }
        System.out.println("Count of vowels are: " + count);
    }
}
