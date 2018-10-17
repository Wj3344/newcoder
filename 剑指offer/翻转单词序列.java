public class Solution {
    public String ReverseSentence(String str) {
               String[] array = str.split(" ");
        if(array.length == 0){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            sb.append(array[i]);
            sb.append(" ");
        }
        sb.append(array[0]);
        return sb.toString();
    }
}