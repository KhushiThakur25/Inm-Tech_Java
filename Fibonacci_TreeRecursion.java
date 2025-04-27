public class Fibonacci_TreeRecursion {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int result = fibonacci(8);
        System.out.println("Your fibonacci term is:" + result);
    }
}
