import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FourSumII454 {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        HashMap<Integer,Integer> integers1 = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                integers.add(A[i]+B[j]);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if(integers1.containsKey(C[i]+D[j])){
                    Integer integer = integers1.get(C[i] + D[j]);
                    integers1.put(C[i]+D[j],integer+1);
                }else {
                    integers1.put(C[i]+D[j],1);
                }
            }
        }

        for (int i = 0; i < integers.size(); i++) {
           if(integers1.containsKey(-integers.get(i))){
               res+=integers1.get(-integers.get(i));
           }
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{1,2},new int[]{-2,-1},new int[]{-1,2},new int[]{0,2}));
    }
}
