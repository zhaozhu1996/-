public class ReverseInteger7 {
    public static int reverse(int x) {

        if(x==0||x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)
            return 0;
        boolean isNegetive = false;
        if(x<0)
            isNegetive = true;
            x = Math.abs(x);
        StringBuffer stringBuffer = new StringBuffer();
        String s = new String();
        stringBuffer.append(x);
        try{
            int i = Integer.parseInt(stringBuffer.reverse().toString());
            return isNegetive? -i:i;
        }catch (Exception e){
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse(-10));
    }
}
