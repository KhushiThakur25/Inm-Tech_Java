public class Function_intro {
    public static int greet() {
        System.out.println("Hello user...");
        return 1111;
    }

    public static int calc(int a, int b) {
        System.out.println("sum of a and b is: " + (a + b));
        return a + b;
    }

    public static long factorial(long n) {
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // System.out.println(greet());
        // System.out.println(calc(2, 3));
        long result = factorial(10);
        System.out.println("Factorial is : " + result);
    }
}
