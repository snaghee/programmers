class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a=0;
        char[] S= s.toCharArray();
        for(int i=0; i<S.length; i++){
            if(S[i]=='p'){
                a++;
            }else if(S[i]=='P'){
                a++;
            }
            else if(S[i]=='y'){
                a--;
            }
            else if(S[i]=='Y'){
                a--;
            }
        }
        if(a!=0){
            answer=false;
        }

        return answer;
    }
}