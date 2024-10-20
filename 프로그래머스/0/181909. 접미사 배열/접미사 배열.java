import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        char[] M = my_string.toCharArray();
        int a = 0;
        for (int i = answer.length - 1; i >= 0; i--) {
            String A = "";
            for (int j = i; j < M.length; j++) {
                A += M[j];
            }
            answer[a] = A;
            a++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
