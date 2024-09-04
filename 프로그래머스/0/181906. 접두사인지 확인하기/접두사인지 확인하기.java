class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        char[] main = my_string.toCharArray();
        char[] serve = is_prefix.toCharArray();
        
        if(main.length<serve.length){
            answer=0;
        }else{
        for(int i=0; i<serve.length; i++){
            if(main[i]!=serve[i]){
                answer=0;
                break;
            }
        }
        }
        
        return answer;
    }
}