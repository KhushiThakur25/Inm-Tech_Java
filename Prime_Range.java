
public class Prime_Range {

    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            int prime = 1;
            int m = (n / 2) + 1;
            for (int i = 2; i < m; i++) {
                if (n % i == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1) {
                System.out.println(n);
            }
        }

    }

}
