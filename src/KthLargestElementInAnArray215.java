public class KthLargestElementInAnArray215 {
    private static int find(int[] nums,int l,int r,int k){

        if(l<r&&l>=0){
            int le = l,ri = r;
            int key = nums[l];
            while (le<ri){
                while (le<ri&&nums[ri]>=key){
                    ri--;
                }
                nums[le] = nums[ri];
                while (le<ri&&nums[le]<=key){
                    le++;
                }
                nums[ri] = nums[le];
            }
            nums[le] = key;
            if(le==r+1-k){
                return nums[le];
            }else if(le<r+1-k){
                return find(nums,le+1,r,k);
            }else {
                return find(nums,l,le-1,k-(r+1-le));
            }
        }
        return nums[l];
    }

    public static int findKthLargest(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        return find(nums,0,nums.length-1,k);
    }

    public static void main(String[] args) {
     /*   System.out.println(findKthLargest(new int[]{3,2,1,6,4},2));
        System.out.println(findKthLargest(new int[]{2,1},2));*/
        System.out.println(findKthLargest(new int[]{7,6,5,4,3,2,1},5));
    }
}
