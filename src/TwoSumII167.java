public class TwoSumII167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length-1;
        while (i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2,7,11,15},9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
