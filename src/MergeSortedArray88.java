public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i = 0,j = 0,k = 0;
        while (i<m&&j<n){
            if(nums1[i]<nums2[j]){
                temp[k++] = nums1[i++];
            }else {
                temp[k++] = nums2[j++];
            }
        }
        while (i<m){
            temp[k++] = nums1[i++];
        }
        while (j<n){
            temp[k++] = nums2[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            nums1[l] = temp[l];
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        merge(new int[]{1},1,new int[]{},0);
    }
}
