class Solution {
    public String solution(String myString) {
        String answer = "";
        char a=0;
        char[] myChars = myString.toCharArray();
        for(int i=0; i<myChars.length; i++){
            if(myChars[i]<97){
                answer+=(char)(myChars[i]+32);
            }else{
                answer+=(char)myChars[i];
            }
        }
        return answer;
    }
}