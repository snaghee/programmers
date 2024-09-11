class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char [] rn= rny_string.toCharArray();
        for(int i=0; i<rn.length; i++){
            if(rn[i]=='m'){
                answer+="rn";
        }else{
                answer+=rn[i];
            }
        }
        return answer;
    }
}