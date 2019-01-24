import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString438 {
    public static List<Integer> findAnagrams(String s, String p) {
        char[] chars = p.toCharArray();
        p.toCharArray();
        List<Integer> res = new LinkedList<>();
        if(p.length()>s.length()){
            return res;
        }
        int[] ints = new int['a'+26];
        for (int i = 0; i < chars.length; i++) {
            ints[chars[i]]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int q = i;
            for (int j = 0; j < p.length(); j++) {
                if(q+j<s.length()){
                    ints[s.charAt(q+j)]--;
                }
            }
            boolean isVaild = true;
            for (int j = 0; j < ints.length; j++) {
                if(ints[j]!=0){
                    isVaild = false;
                }
                ints[j] = 0;
            }
            for (int k = 0; k < chars.length; k++) {
                ints[chars[k]]++;
            }
            if(isVaild){
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}
