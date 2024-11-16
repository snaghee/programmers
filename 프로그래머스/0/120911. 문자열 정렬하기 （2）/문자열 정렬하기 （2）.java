import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String l = my_string.toLowerCase();
        char[] A = l.toCharArray();
        Arrays.sort(A);
        String answer = new String(A);
        
        return answer;
    }
}