import java.util.HashMap;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if(s.length!=pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(s[i])){
                    return false;
                }
                map.put(pattern.charAt(i),s[i]);
            }else {
                if(!map.get(pattern.charAt(i)).equals(s[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
