public class ValidPalindrome125 {
    private static boolean isVaild(char c){
        return c>='0'&&c<='9'||c<='z'&&c>='a';
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int i = 0,j = chars.length-1;
        while (i<j){
            if(isVaild(chars[i])&&isVaild(chars[j])){
                if(chars[i]==chars[j]){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }else if(!isVaild(chars[i])){
                i++;
            }else {
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
}
