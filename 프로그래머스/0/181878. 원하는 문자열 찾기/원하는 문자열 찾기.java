class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length()<pat.length()){
            return 0;
        }
        if(true==myString.toLowerCase().contains(pat.toLowerCase())){
            answer=1;
        }
        return answer;
    }
}