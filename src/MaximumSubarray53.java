public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {

        /***
         * 前面的和大于0则继续往后加，小于0则直接抛弃
         */
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
