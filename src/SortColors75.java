public class SortColors75 {
    public static void sortColors(int[] nums) {
        int[] color = new int[3];
        for (int i = 0; i < nums.length; i++) {
            color[nums[i]]++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(j<color[0]){
                nums[j] = 0;
            }else if(j>=color[0]+color[1]){
                nums[j] = 2;
            }else {
                nums[j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        sortColors(new int[] {0,0,2,1,1,0});
    }
}
