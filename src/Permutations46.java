import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Permutations46 {
    private static List<List<Integer>> res = new LinkedList<>();
    private static boolean[] isUsed;
    private static void permutations(int[] nums, int index, List<Integer> list){
        if(index == nums.length){
            res.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!isUsed[i]){
                list.add(nums[i]);
                isUsed[i]=true;
                permutations(nums,index+1,list);
                list.remove(list.size()-1);
                isUsed[i] = false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        if (nums==null||nums.length==0){
            return res;
        }
        isUsed = new boolean[nums.length];
        for (int i = 0; i < isUsed.length; i++) {
            isUsed[i] = false;
        }
        List<Integer> integers = new LinkedList<>();
        permutations(nums,0,integers);
        return res;
    }

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }
}
