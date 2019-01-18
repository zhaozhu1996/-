public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if(nums[k]!=0){
                nums[i++] = nums[k];
            }
        }

        while (i<nums.length){
            nums[i++] = 0;
        }

    }
}
