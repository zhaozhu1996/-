
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(i==0||i>0&&nums[i]>nums[i-1]){
                int l = i+1,r = nums.length-1;
                while (l<r){
                    if(nums[l]+nums[r]+nums[i]==0){
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[l]);
                        integers.add(nums[r]);
                        integers.add(nums[i]);
                        res.add(integers);
                        l++;
                        r--;
                        while (l<r&&nums[l]==nums[l-1]){
                            l++;
                        }
                        while (l<r&&nums[r]==nums[r+1]){
                            r--;
                        }
                    }else if(nums[l]+nums[r]+nums[i]<0){
                        l++;
                    }else {
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1,-1,0,1,2,4});
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j));
            }
            System.out.println();
        }
    }
}
