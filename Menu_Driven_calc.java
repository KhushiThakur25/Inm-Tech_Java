import java.util.Scanner;

public class Menu_Driven_calc {
    public static void add(int a, int b) {
        System.out.println("sum is " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("sub is " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("mul is " + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println("div is " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int n = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int m = sc.nextInt();
        System.out.println(
                "Enter the operation: \n Press 1 for add \n Press 2 for subtract \n Press 3 for multiply \n Press 4 for division ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                add(n, m);
                break;
            case 2:
                sub(n, m);
                ;
                break;
            case 3:
                mul(n, m);
                break;
            case 4:
                div(n, m);
                break;

            default:
                System.out.println("Invalid Input !");
                break;
        }
        sc.close();
    }
}
