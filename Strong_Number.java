public class Strong_Number {
    public static void main(String[] args) {
        int n = 125;
        int sum = 0;
        int rem = 0;

        int org = n;
        while (n > 0) {
            int fact = 1;
            rem = n % 10;
            System.out.println("rem" + rem);
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            System.out.println("sum" + sum + "fact" + fact);
            n /= 10;
            System.out.println("n " + n);
        }
        if (org == sum) {
            System.out.println("Number is strong..");
        } else {
            System.out.println("Number is not strong..");
        }
    }
}
