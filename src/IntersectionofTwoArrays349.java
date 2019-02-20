import java.util.HashSet;
import java.util.LinkedList;

public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedList<Integer> integers1 = new LinkedList<>();
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            integers.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(integers.contains(nums2[i])&&!integers1.contains(nums2[i])){
                integers1.add(nums2[i]);
            }
        }
        int[] res = new int[integers1.size()];
        for (int i = 0; i < integers1.size(); i++) {
            res[i] = integers1.get(i);
        }
        return res;
    }
}
