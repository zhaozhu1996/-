public class PalindromeNumber9 {
    public static boolean isPalindrome(int x) {
        Integer integer = x;
        String s = String.valueOf(integer);
        char[] chars = s.toCharArray();
        int begin = 0;
        int end = chars.length-1;
        while (begin<end){
            if(chars[end]==chars[begin]){
                begin++;
                end--;
            }else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
}
