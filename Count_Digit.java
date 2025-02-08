import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number...");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            count += 1;
            n /= 10;
            System.out.println("number  " + n + "  Count  " + count);
        }
        System.out.println("Your count of digit is: " + count);
        sc.close();
    }
}
