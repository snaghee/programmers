class Solution {
    public String solution(String myString) {
        String answer = "";
        char[]my=myString.toCharArray();
        for(int i=0; i<my.length; i++){
            if(my[i]<='l'){
                answer+='l';
            }else answer+=my[i];
        }
        return answer;
    }
}