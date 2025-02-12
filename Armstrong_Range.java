public class Armstrong_Range {
    public static void main(String[] args) {
        int sum, count, org;
        for (int n = 1; n <= 1000; n++) {

            count = 0;
            sum = 0;
            org = n;
            while (org > 0) {
                count++;
                org /= 10;
            }
            org = n;
            while (org > 0) {
                sum += Math.pow(org % 10, count);
                org /= 10;
            }
            if (n == sum) {
                System.out.println(n);
            }
        }
    }
}
