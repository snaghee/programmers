class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char b=0;
        char c=0;
        char[] m = my_string.toCharArray();
        for(int i=0; i<m.length; i++){
            if(i==num1){
                b=m[i];
            }else if(i==num2){
               c=m[i]; 
            }
        }
     for(int i=0; i<m.length; i++){
            if(i==num1){
                answer+=c;
            }else if(i==num2){
               answer+=b; 
            }else answer+=m[i];
        }
        
        return answer;
    }
}