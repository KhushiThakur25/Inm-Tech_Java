import java.util.Scanner;

public class Array_intro {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 56, 4, 4, 12, 521, 45 };
        int[] arr1 = new int[10];
        System.out.println(arr.length);
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = 1;
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();
        // for (int i : arr) {
        // System.out.println(i);
        // }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the value for index: " + i);
            int n = sc.nextInt();
            arr1[i] = n;
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
