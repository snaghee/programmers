class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] R = rsp.toCharArray();
        for(int i=0; i<R.length; i++){
            if(R[i]=='2'){
                answer+='0';
            }else if(R[i]=='0'){
                answer+='5';
            }else if(R[i]=='5'){
                answer+='2';
            }
        }
        return answer;
    }
}