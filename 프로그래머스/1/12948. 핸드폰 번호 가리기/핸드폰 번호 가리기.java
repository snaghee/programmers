class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char [] p= phone_number.toCharArray();
        for(int i=0; i<p.length; i++){
            if(i<p.length-4){
                answer+="*";
            }else {
                answer+=p[i];
            }
        }
        return answer;
    }
}