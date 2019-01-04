import java.util.ArrayList;

public class QuickSort {
    public static void quickSort(int[] list,int l, int r){

        if(l<r&&l>=0){
            int i = l;
            int j = r;
            int temp = list[l];
            while (l<r) {
                while (list[r] >= temp && l < r) {
                    r--;
                }
                list[l] = list[r];
                while (list[l] <= temp && l < r) {
                    l++;
                }
                list[r] = list[l];
            }

            list[l] = temp;
            quickSort(list,i,l-1);
            quickSort(list,l+1,j);
        }

    }
}
