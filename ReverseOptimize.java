public class ReverseOptimize {
    public static void main(String[] args) {
        int[] arr = { 95, 82, 14, 13, 12, 8, 6, 3 };
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
