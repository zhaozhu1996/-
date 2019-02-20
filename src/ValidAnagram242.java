import java.util.HashMap;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        for (int i = 0; i <S.length; i++) {
            hashMap.put(S[i],hashMap.containsKey(S[i])?hashMap.get(S[i])+1:1);
        }
        for (int i = 0; i < T.length; i++) {
            if(hashMap.containsKey(T[i])&&hashMap.get(T[i])>0){
                hashMap.put(T[i],hashMap.get(T[i])-1);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ab","a"));
    }
}
