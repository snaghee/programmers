class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] O = Integer.toString(order).toCharArray();
        for(int i=0; i<O.length; i++){
            if(O[i]=='3'||O[i]=='6'||O[i]=='9')answer++;
        }
        return answer;
    }
}