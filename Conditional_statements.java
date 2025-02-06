import java.util.Scanner;

public class Conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age..");
        int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("Welcome to party..");
        // } else {
        // System.out.println("Exit..");
        // }

        // if (age == 15) {
        // System.out.println("You need to study for 4 hrs in a day");
        // } else if (age == 17) {
        // System.out.println("You need to study for 6 hrs in a day");
        // } else if (age == 19) {
        // System.out.println("You need to study for 8 hrs in a day");
        // } else {
        // System.out.println("Invalid input/age");
        // }

        if (age >= 18) {
            System.out.println("Welcome to gate no 1....");
            System.out.println("Enter 1 for id and 0 for no id..");
            int id = sc.nextInt();
            if (id == 1) {
                System.out.println("Welcome to party..");
            } else {
                System.out.println("You haven't id, so you are not allowed..");
            }
        } else {
            System.out.println("You are not allowed for this party..");
        }

    }
}
