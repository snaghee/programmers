class Solution {
    public int solution(int[] num_list) {
    int answer = 0;
    int o=0;
    int t=0;
        for(int i=0; i<num_list.length; i+=2 ){
            o+=num_list[i];
        }
        for(int j=1; j<num_list.length; j+=2 ){
            t+=num_list[j];
            }
        if(o>t){
            answer=o;
        } else answer=t;
        return answer;
    }
}