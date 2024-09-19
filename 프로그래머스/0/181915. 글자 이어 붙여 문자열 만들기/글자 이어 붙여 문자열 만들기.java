class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char [] my= my_string.toCharArray();
        for(int i=0; i<index_list.length; i++){
            answer+=my[index_list[i]];
        }
        return answer;
    }
}