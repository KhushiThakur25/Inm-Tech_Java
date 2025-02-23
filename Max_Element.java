public class Max_Element {
    public static void main(String[] args) {
        int[] arr = { 2, 41, 52, 63, 45, 62 };
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Maximum value is: " + max);
    }
}
