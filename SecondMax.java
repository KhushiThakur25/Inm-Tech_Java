public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 51, 6, 11, 63, 55 , 56 ,61};
        int max = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                Second = max;
                max = i;
            }
            if (i < max && i >Second) {
                Second = i;
            }
        }
        System.out.println("Maximum value is: " + max + " Second max is: " + Second);
    }
}
