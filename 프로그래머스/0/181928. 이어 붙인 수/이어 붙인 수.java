class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int an=0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2!=0){
            answer*=10;
            answer+=num_list[i];
            }else{
            an*=10;
            an+=num_list[i];
            }
        }
        answer+=an;
        return answer;
    }
}