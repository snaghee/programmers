class Solution {
    public String solution(String my_string) {
        char [] a=my_string.toCharArray();
        String answer = "";
        for(int i=0; i<a.length ; i++){
            if(97<=a[i]){
            answer+=(char)(a[i]-32);
            }else {
                answer+=(char)(a[i]+32);
            }
        }
        return answer;
    }
}