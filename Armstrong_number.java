public class Armstrong_number {
    public static void main(String[] args) {
        int n = 145;
        int sum, count, org;
        count = 0;
        sum = 0;
        org = n;
        while (n > 0) {
            count++;
            n /= 10;
        }
        n = org;
        while (n > 0) {
            sum += Math.pow(n % 10, count);
            n /= 10;
        }
        if (org == sum) {
            System.out.println("Number is an armstrong..");
        } else {
            System.out.println("Number is not an armstrong..");
        }

    }
}
