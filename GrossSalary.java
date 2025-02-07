import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        float bs = sc.nextFloat();
        double HRA = 0;
        double DA = 0;
        double Gross_Salary = 0;
        if (bs <= 10000) {
            HRA = 0.2 * bs;
            DA = 0.8 * bs;
        } else if (bs <= 20000) {
            HRA = 0.25 * bs;
            DA = 0.9 * bs;
        } else if (bs > 20000) {
            HRA = 0.3 * bs;
            DA = 0.95 * bs;
        }
        Gross_Salary = bs + HRA + DA;
        System.out.println("Your gross salary is : " + Gross_Salary);
        sc.close();
    }
}
