public class Main {

    public static void main(String[] args) {
        int[] ints = {3,4,2,1,6,8,9,0,5,7};
        QuickSort.quickSort(ints,0,9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
