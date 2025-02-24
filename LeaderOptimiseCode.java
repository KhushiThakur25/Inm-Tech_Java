public class LeaderOptimiseCode {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 114, 13, 12, 81, 6, 3 };
        int leader = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }
}
