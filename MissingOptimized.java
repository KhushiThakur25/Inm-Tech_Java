public class MissingOptimized {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 6, 3 };
        int[] arr1 = new int[arr.length + 2];
        arr1[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]] = 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                System.out.println("missing number is: " + i);
            }
        }
    }
}
