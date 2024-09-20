class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] my= myString.toCharArray();
        String an="";
        for(int i=0; i<my.length; i++){
            if(my[i]=='A'){
                an+='B';
            }else an+='A';
        }
        if (an.contains(pat)) {
            answer = 1;
        } 
        return answer;
    }
}