class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    len++;
                    arr[i]=0;
                }
            }
        }
        int[] answer = new int [arr.length-len];
        len=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
            answer[len++]=arr[i];
        }
        }
        return answer;
    }
}