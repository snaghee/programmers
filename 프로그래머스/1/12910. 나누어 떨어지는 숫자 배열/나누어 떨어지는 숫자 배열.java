import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
                                 }
        }
        if(count==0){count++;}
        int[] answer = new int[count];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
             answer[a]=arr[i];
            a++;
            }
        }
        if(answer[0]==0){answer[0]=-1;}
        Arrays.sort(answer);
        return answer;
    }
}