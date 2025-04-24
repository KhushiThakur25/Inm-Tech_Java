public class Recursion {
    static void greet(int n) {
        if (n >= 5) {
            return;
        }
        System.out.println("hello dear " + n);
        greet(n + 1);
        System.out.println("hello dear " + n);
    }

    public static void main(String[] args) {
        greet(0);
    }
}
