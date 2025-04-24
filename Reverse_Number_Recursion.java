public class Reverse_Number_Recursion {
    static int reverse(int n, int rev) {
        if (n <= 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int result = reverse(1234, 0);
        System.out.println("Your reverse value is " + result);
    }
}
