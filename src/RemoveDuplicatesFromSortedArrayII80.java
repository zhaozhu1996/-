public class RemoveDuplicatesFromSortedArrayII80 {
    public static int removeDuplicates(int[] nums) {
        int temp = Integer.MAX_VALUE;
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i]==temp){
                count++;
                if(count>2){
                    len--;
                    count--;
                    for (int j = i+1; j < nums.length; j++) {
                        nums[j-1] = nums[j];
                    }
                    i--;
                }
            }else {
                count = 1;
                temp = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        System.out.println(i);
    }
}
