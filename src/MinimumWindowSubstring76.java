import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring76 {
    public static String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int l = 0,r = s.length();
        int i = 0, j = 0;
        int countIn = 0;
        int len = Integer.MAX_VALUE;
        HashMap<Character,Integer> count = new HashMap<>();
        for (int k = 0; k < T.length; k++) {
            Integer integer = count.get(T[k]);
            if(integer!=null){
                integer++;
                count.put(T[k],integer);
            }else {
                count.put(T[k],1);
            }
        }
        while (i<S.length||j<S.length){
            if(countIn==T.length){
                if((j-i)<len){
                    l = i;
                    r = j;
                    len = j-i;
                }
                Integer integer = count.get(S[i]);
                if(integer!=null){
                    if(integer>=0){
                        countIn--;
                    }
                    if(j==S.length&&integer>=0){
                        break;
                    }
                    integer++;
                    count.put(S[i],integer);
                }
                i++;
            }else {
                if(j==S.length){
                    break;
                }
                Integer integer = count.get(S[j]);
                if(integer!=null){
                    if(integer>0){
                        countIn++;
                    }
                    integer--;
                    count.put(S[j],integer);
                }
                j++;
            }
        }
        return len == Integer.MAX_VALUE ?  "" : s.substring(l,r);
    }

    public static void main(String[] args) {
        /*System.out.println(minWindow("ADOBECODEBANC",  "ABC"));*/
        /*System.out.println(minWindow("a",  "a"));*/
        System.out.println(minWindow("bba",  "ab"));
    }
}
