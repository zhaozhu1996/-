public class Array2Heap {
    private static int heapSize = 0;
    private static int[] heap = null;
    public static void array2Heap(int[] nums,int size){
        heap = nums;
        for (int i = 0; i < size; i++) {
            heapSize++;
            heapify(heap,i);
        }
    }

    private static void heapify(int[] nums,int i){
        int parentIndex = (i-1)/2;
        while (parentIndex>=0){
            if(nums[parentIndex]<nums[i]||parentIndex==0){
                if(nums[parentIndex]<nums[i]){
                    int temp = nums[parentIndex];
                    nums[parentIndex] = nums[i];
                    nums[i] = temp;
                }
                if(parentIndex==0){
                    break;
                }
                i = parentIndex;
                parentIndex = (parentIndex-1)/2;
            }else {
                break;
            }
        }
    }

    private static void insert(int num){
        heap[heapSize] = num;
        heapSize++;
        heapify(heap,heapSize-1);
    }

    private static int getMaxChildIndex(int cur){
        int childIndex = -1;
        if(heapSize>=3){
            childIndex = heap[1]>heap[2]?1:2;
        }else if(heapSize==2){
            childIndex = 1;
        }else {
            return -1;
        }
        return childIndex;
    }


    private static void heapPopify(int cur){
        int childIndex = getMaxChildIndex(0);
        if(childIndex==-1){
            return;
        }
        while (childIndex<heapSize&&heap[childIndex]>heap[cur]){
            int temp = heap[childIndex];
            heap[childIndex] = heap[cur];
            heap[cur] = temp;
            cur = childIndex;
            childIndex = getMaxChildIndex(cur);

        }
    }

    private static int pop(){
        heapSize--;
        int temp = heap[heapSize];
        heap[heapSize] = heap[0];
        heap[0] = temp;
        heapPopify(0);
        return heap[heapSize];

    }


    public static void main(String[] args) {
        int[] ints = new int[1000];
        ints[0] = 4;
        ints[1] = 5;
        ints[2] = 6;
        ints[3] = 3;
        ints[4] = 4;
        array2Heap(ints,5);
        insert(7);
        System.out.println(pop());
        System.out.println(pop());
        for (int i = 0; i <heapSize ; i++) {
            System.out.println(ints[i]);
        }
    }

}
