class Solution {
    public int[] solution(String myString) {
        char[] m= myString.toCharArray();
        int a=1;
        for(int i=0; i<m.length; i++){
            if(m[i]=='x'){
                a++;
            }
        }
        int[] answer = new int [a];
        a=0;
        int n=0;
        for(int i=0; i<m.length; i++){
            if(m[i]!='x'){
                answer[n]+=1;
            }else{
                answer[n]+=0;
                n++;
            }
        }
        return answer;
    }
}