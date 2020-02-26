public class SearchInRotatedSortedArray33 {
    public static int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length<=1){
            return nums[0]==target?0:-1;
        }
        if(nums.length==2){
            if(nums[0]==target) return 0;
            if(nums[1]==target) return 1;
            return -1;
        }
        int l = 0,r = nums.length-1;
        int mid = (l+r)/2;
        while (l<=r){
            if(nums[mid]==target){
                return mid;
            }else {
                if(nums[l]<=nums[mid]){
                    if(target<=nums[mid]&&target>=nums[l]){
                        r = mid-1;
                        mid = (l+r)/2;
                    }else {
                        l = mid+1;
                        mid = (l+r)/2;
                    }
                }else {
                    if(target>=nums[mid]&&target<=nums[r]){
                        l = mid+1;
                        mid = (l+r)/2;
                    }else{
                        r = mid-1;
                        mid = (l+r)/2;
                    }
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},1));
    }
}
