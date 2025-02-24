public class ReverseReadArray {
    public static void main(String[] args) {
        int[] arr = { 95, 82, 14, 13, 12, 8, 6, 3 };
        int[] arr1 = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
