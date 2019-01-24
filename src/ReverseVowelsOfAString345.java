public class ReverseVowelsOfAString345 {
    private boolean isVowels(char c){
        return c=='a'||c=='o'||c=='e'||c=='u'||c=='i'||
                c=='A'||c=='O'||c=='E'||c=='U'||c=='I';
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length-1;
        while (i<j){
            if(isVowels(chars[i])&&isVowels(chars[j])){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            if(!isVowels(chars[i])){
                i++;
            }
            if(!isVowels(chars[j])){
                j--;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < chars.length; k++) {
            stringBuilder.append(chars[k]);
        }
        return stringBuilder.toString();
    }
}
