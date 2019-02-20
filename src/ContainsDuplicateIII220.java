
import java.util.SortedSet;
import java.util.TreeSet;

public class ContainsDuplicateIII220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        SortedSet<Long> integers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            SortedSet<Long> longs = integers.subSet((long) nums[i] - t, (long) nums[i] + t + 1);
            if(!longs.isEmpty()) return true;
            if(i>=k) integers.remove((long)nums[i-k]);
            integers.add((long) nums[i]);
        }
        return false;
    }
}
