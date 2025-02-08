import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value...");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int third = 0;
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
        sc.close();
    }
}
