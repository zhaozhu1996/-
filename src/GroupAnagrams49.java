import java.util.*;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new LinkedList<>();
        if(strs.length==1){
            LinkedList<String> strings = new LinkedList<>();
            strings.add(strs[0]);
            res.add(strings);
            return res;
        }
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = Arrays.toString(chars);
            if(!map.containsKey(s)){
                LinkedList<String> strings = new LinkedList<>();
                strings.add(strs[i]);
                map.put(s,strings);
            }else {
                List<String> strings = map.get(s);
                strings.add(strs[i]);
                map.put(s,strings);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> lists = groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"});
       /* List<List<String>> lists = groupAnagrams(new String[]{
                ""});*/
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

}
