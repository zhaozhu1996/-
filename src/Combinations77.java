import java.util.LinkedList;
import java.util.List;

public class Combinations77 {

    private static List<List<Integer>> res = new LinkedList<>();
    private static void combinations(int n,int k,int index,List<Integer> list){
        if(list.size()==k){
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.addAll(list);
            res.add(linkedList);
            return;
        }
        for (int i = index; i <= n; i++) {
            list.add(i);
            combinations(n,k,i+1,list);
            list.remove(list.size()-1);

        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        if(n<k){
            return res;
        }
        combinations(n,k,1,new LinkedList<>());
        return res;
    }

    public static void main(String[] args) {
        combine(4,2);
    }
}
