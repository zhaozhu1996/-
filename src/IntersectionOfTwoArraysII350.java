import java.util.HashMap;
import java.util.LinkedList;

public class IntersectionOfTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> integers1 = new LinkedList<>();
        HashMap<Integer,Integer> integers = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            integers.put(nums1[i],integers.containsKey(nums1[i])?integers.get(nums1[i])+1:1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(integers.containsKey(nums2[i])&&integers.get(nums2[i])>0){
                integers1.add(nums2[i]);
                integers.put(nums1[i],integers.get(nums2[i])-1);
            }
        }
        int[] res = new int[integers1.size()];
        for (int i = 0; i < integers1.size(); i++) {
            res[i] = integers1.get(i);
        }
        return res;
    }
}
