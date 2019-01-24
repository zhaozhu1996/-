public class MinimumSizeSubarraySum209 {
    public static int minSubArrayLen(int s, int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int i = 0,j = 0;
        int res = Integer.MAX_VALUE;
        int sum = nums[0];
        while (i<nums.length&&j<nums.length){
            if(sum==s){
               res = Math.min(res,j-i);
               j++;
               if(j<nums.length){
                   sum+=nums[j];
               }
            }else if(sum>s){
                res = Math.min(res,j-i);
                sum-=nums[i];
                i++;
            }else {
                j++;
                if(j<nums.length){
                    sum+=nums[j];
                }
            }
        }
        return res==Integer.MAX_VALUE?0:res+1;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
}
