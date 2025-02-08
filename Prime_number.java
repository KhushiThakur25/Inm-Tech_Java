import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value...");
        int n = sc.nextInt();
        // boolean prime = true;
        // int count = 0;
        int prime = 1;
        int m = (n / 2) + 1;
        for (int i = 2; i < m; i++) {
            // count++;
            if (n % i == 0) {
                System.out.println("Number is not prime..");
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println("Number is prime...");
        }
        // System.out.println("Your count is: " + count);
        sc.close();
    }
}
