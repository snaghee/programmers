class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
      char[] myChars = code.toCharArray();
        for(int i=r; i<myChars.length;i+=q){
            answer+=myChars[i];
        }
        return answer;
    }
}