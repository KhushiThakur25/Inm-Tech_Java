import java.util.Scanner;

public class User_Defined_Error {
    public static void atm() throws Exception {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        double balance = 10000.0;

        System.out.println("Enter your PIN: ");
        int enterPin = sc.nextInt();
        if (enterPin != correctPin) {
            throw new Exception("Invalid PIN .Please try again..");
        }
        System.out.println("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            throw new Exception("Insufficient balance..");
        } else if (amount <= 0) {
            throw new Exception("Invalid withdrawal amount..");
        } else {
            balance -= amount;
            System.out.println("Withdrawal  successful! Remaining balance is : " + balance);
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            atm();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
