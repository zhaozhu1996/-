public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==1){
            return nums[0]==target?new int[]{0,0}:new int[]{-1,-1};
        }
        int l = 0,r = nums.length-1;
        int mid = (r+l)/2;
        int[] ints = new int[]{-1,-1};
        while (l<=r){
            if(nums[mid]<target){
                l = mid+1;
                mid = (r+l)/2;
            }else if(nums[mid]>target){
                r = mid-1;
                mid = (r+l)/2;
            }else {
                int ls = mid,rs = mid;
                while (ls>=0&&nums[ls]==target){
                    ls--;
                }
                while (rs<nums.length&&nums[rs]==target){
                    rs++;
                }
                ints[0] = ls+1;
                ints[1] = rs-1;
                return ints;
            }
        }
        return ints;

    }

    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{5,7,7,8,8,10}, 7);
        System.out.println(ints[0]+ints[1]);
    }
}
