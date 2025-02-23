public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 8, 9, 1 };
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
