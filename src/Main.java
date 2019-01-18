public class Main {

    public static void main(String[] args) {
        int[] ints = {3,2,1,6,4};
        QuickSort.quickSort(ints,0,4);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
