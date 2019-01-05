import java.util.HashSet;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if(integers.contains(target-nums[i])){
                for (int j = 0; j < nums.length; j++) {
                    if((nums[j] == target-nums[i])&& (i!=j)){
                        return new int[] {i,j};
                    }
                }

            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = {2,7,11,5};
        int[] ints1 = twoSum(ints, 9);
    }
}
