public class SumAlternate {
    public static void main(String[] args) {
        int n = 1234561;
        int sum = 0;

        while (n > 0) {
            int count = 0;
            int org = n;
            while (org > 0) {
                count += 1;
                org /= 10;
            }
            System.out.println("count" + count);

            sum += n / Math.pow(10, count - 1);
            n %= Math.pow(10, count - 2);
            System.out.println(n);
        }
        System.out.println(sum);
    }
}
