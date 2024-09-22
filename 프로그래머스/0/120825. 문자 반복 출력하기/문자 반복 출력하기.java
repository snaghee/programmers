class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] m= my_string.toCharArray();
        for(int i=0; i<m.length; i++){
            for(int j=0; j<n; j++){
            answer+=m[i];
            }
        }
        return answer;
    }
}