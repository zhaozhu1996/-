import java.util.HashSet;

public class ContainsDuplicateII219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k<=0){
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])){
                return true;
            }else {
                if(hashSet.size()>k-1){
                    hashSet.remove(nums[i-k]);
                    hashSet.add(nums[i]);
                }else {
                    hashSet.add(nums[i]);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1,2,1},0));
    }
}
