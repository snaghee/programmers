class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] O = Integer.toString(num).toCharArray();
        char a = Character.forDigit(k, 10); 
        for(int i=0; i<O.length; i++){
            if(O[i]==a){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}