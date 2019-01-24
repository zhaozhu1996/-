public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int i = 0,j = height.length-1;
        int res = 0;
        while (i<j){
           int h = Math.min(height[i],height[j]);
           res = Math.max(res,h*(j-i));
           if(height[i]<height[j]){
               i++;
           }else {
               j--;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
