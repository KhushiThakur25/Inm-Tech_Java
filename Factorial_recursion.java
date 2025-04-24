public class Factorial_recursion {
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println("Your fact value is : " + fact);
    }
}
