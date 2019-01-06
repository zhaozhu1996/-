public class LongestSubstringWithoutRepeatingCharacters3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int[] temp = new int[256];
        for (int i = 0; i < temp.length; i++)
            temp[i] = 0;
        int l = 0;
        int r = -1;
        int res = 0;
        while (r<s.length()-1){
            if(r+1<s.length()&&temp[s.charAt(r+1)]==0){
                r++;
                temp[s.charAt(r)]++;
            }else {
                temp[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
