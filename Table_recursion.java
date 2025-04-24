public class Table_recursion {
    static void table(int n, int i) {
        if (i > 10) {
            return;
        }
        System.out.println(n + " X " + i + " = " + (n * i));
        table(n, i + 1);
    }

    public static void main(String[] args) {
        table(3, 1);
    }
}
