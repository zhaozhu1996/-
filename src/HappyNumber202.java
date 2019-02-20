import java.util.HashSet;

public class HappyNumber202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            int calNum = 0;
            while (n!=0){
                int x = n%10;
                n = n/10;
                calNum+=x*x;
            }
            if(calNum==1){
                return true;
            }
            n = calNum;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
