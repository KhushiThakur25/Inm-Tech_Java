
import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        String name = "Riya is my friend";
        char[] st = { 'R', 'i', 'y', 'a' };
        String str = st.toString();
        char[] st1 = name.toCharArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character...");
        char ch = sc.next().charAt(0);
        System.out.println("Enter age in string type");
        String age = sc.next();
        System.out.println("Enter ages in string type");
        String ages = sc.nextLine();
        for (int i = 0; i < st.length; i++) {
        System.out.println(st[i]);
        }

        System.out.println(ch);
        System.out.println(age);
        // System.out.println(ages);
        for (int i = 0; i < name.length(); i++) {
        System.out.println(name.charAt(i));
        }

        String[] arr = name.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
        // sc.close();
    }
}
