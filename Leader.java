public class Leader {
    public static void main(String[] args) {
        int[] arr = { 95, 82, 14, 13, 12, 8, 6, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.println(arr[i]);
            }
        }

        System.out.println(arr[arr.length - 1]);

    }
}
