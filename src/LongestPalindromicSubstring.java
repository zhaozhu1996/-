public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String res = "" ;
        int len = -1;
        int[][] map = new int[chars.length][chars.length];

        for (int i = 0; i < chars.length; i++) {
            map[i][i] = 1;
        }

        for (int j = 0; j < chars.length; j++) {
            for (int i = 0; i <= j; i++) {
                if(chars[i]==chars[j]){
                    if((i+1<chars.length&&j-1>=0&&map[i+1][j-1]==1)||(j-i<=2)){
                        map[i][j] = 1;
                        if(j-i>len){
                            len = j-i;
                            res = s.substring(i,j+1);
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
}
