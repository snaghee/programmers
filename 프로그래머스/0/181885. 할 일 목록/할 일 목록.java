class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int n=0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){
                n++;
            }
        }
        String[] answer = new String [n];
        n=0;
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){
                answer[n]=todo_list[i];
                n++;
            }
        }
        return answer;
    }
}