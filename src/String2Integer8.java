

public class String2Integer8 {

    public static String number = "0123456789";

    public static int myAtoi(String str) {
        str = str.trim();
        StringBuilder num = new StringBuilder("");
        int begin = 0;
        boolean isNeg = false;
        Integer res = 0;
        if(str.startsWith("-")){
            isNeg = true;
            begin++;
        }

        if(str.startsWith("+")){
            begin++;
        }
        char[] chars = str.toCharArray();
        for (int i = begin; i < chars.length; i++) {
            String s = chars[i] + "";
            if(number.contains(s)){
                Integer integer = Integer.valueOf(s);
                if(res>Integer.MAX_VALUE/10||( Integer.MAX_VALUE/10 == res&&Integer.MAX_VALUE%10< integer)){
                   return isNeg?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }else {
                    res = res*10+integer;
                }
            }else {
                return isNeg?(0-res):res;
            }
        }
        return isNeg?(0-res):res;

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
