import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 0;
        // char operator;
        int operator;

        try {
            System.out.println("Enter the first number..");
            num1 = sc.nextInt();

            System.out.println("Enter the second number..");
            num2 = sc.nextInt();
            System.out.println("Enter operator (+ , - , * , / ): ");
            operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator..");
                    break;
            }
            System.out.println("Result : " + result);
        }

        catch (Exception e) {
            System.out.println("Oops! something went wrong...");
        }
    }
}
