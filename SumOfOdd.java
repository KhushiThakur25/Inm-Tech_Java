public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
            // i += 2;
        }
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i += 2;
        // }
        System.out.println(sum);
    }
}
