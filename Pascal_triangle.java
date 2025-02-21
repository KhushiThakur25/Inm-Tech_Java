public class Pascal_triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int k = (int) Math.pow(11, i);
            while (k > 0) {
                System.out.print(k % 10 + " ");
                k /= 10;
            }
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" ");
        // }
        // int value = 1;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(value + " ");
        // value = value * (i - j) / (j + 1);
        // }
        // System.out.println();
        // }
    }
}
