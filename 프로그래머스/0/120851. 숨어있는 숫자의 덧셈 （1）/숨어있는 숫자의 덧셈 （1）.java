class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] mys = my_string.toCharArray();
        for (char c : mys) {
            if (c >= '1' && c <= '9') {
                answer += c - '0'; 
            }
        }
        return answer;
    }
}
