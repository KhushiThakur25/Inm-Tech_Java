public class ButterFly {
    public static void main(String[] args) {
        int n = 8;
        int m = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i + 1; j < m - 1 - i; j++) {
                System.out.print("  ");
            }
            int b = m - 1 - i;
            if (b == n - 1) {
                b += 1;
            }
            for (int j = b; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int k = n - 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i; j++) {
                System.out.print("* ");
            }
            for (int j = k - i; j < k + i + 1; j++) {
                System.out.print("  ");
            }

            for (int j = k + i +1; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
