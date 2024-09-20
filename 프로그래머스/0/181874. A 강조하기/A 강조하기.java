class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] m= myString.toCharArray();
        for(int i=0; i<m.length; i++){
            if(m[i]==97){
                answer+='A';
            }else if(m[i]>65&&m[i]<97){
                answer+=(char)(m[i]+32);
            }else answer+=m[i];
        }
        return answer;
    }
}