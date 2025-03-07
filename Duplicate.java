import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 5, 4, 5, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        int max = nums[0];
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > maxVal) {
                System.out.println(i);
                max = nums[i];
                maxVal = map.get(nums[i]);
            }
        }
        System.out.println(max);
    }
    // System.out.println(map);
}
