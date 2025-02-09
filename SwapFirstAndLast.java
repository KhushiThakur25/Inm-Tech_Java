public class SwapFirstAndLast {
    public static void main(String[] args) {
        int n = 12345;
        int m = n;
        int first;
        int last = n % 10;
        int mid = 0;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        // System.out.println("count of number : " + count + " " + n);
        n = m;
        first = n / (int) Math.pow(10, count - 1);
        // System.out.println("First and last : " + first + " , " + last);

        mid = (n % (int) Math.pow(10, count - 1)) / 10;
        // System.out.println(mid);
        n = last * (int) Math.pow(10, count - 1) + mid * 10 + first;
        System.out.println("Your n after swap first and last digit.. " + n);
    }
}
