import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of : ");
        System.out.println("Physics...");
        int physics = sc.nextInt();
        System.out.println("Chemistry...");
        int chemistry = sc.nextInt();
        System.out.println("Biology...");
        int biology = sc.nextInt();
        System.out.println("Maths...");
        int math = sc.nextInt();
        System.out.println("Computer...");
        int computer = sc.nextInt();

        int total = physics + chemistry + math + biology + computer;

        float percentage = total / 5;
        System.out.println("Your percentage is: " + percentage);
        if (percentage >= 90) {
            System.out.println("Your grade is A..");
        } else if (percentage >= 80) {
            System.out.println("Your grade is B..");
        } else if (percentage >= 70) {
            System.out.println("Your grade is C..");
        } else if (percentage >= 60) {
            System.out.println("Your grade is D..");
        } else if (percentage >= 50) {
            System.out.println("Your grade is E..");
        } else {
            System.out.println("Your grade is F (FAIL)..");
        }
        sc.close();
    }
}
