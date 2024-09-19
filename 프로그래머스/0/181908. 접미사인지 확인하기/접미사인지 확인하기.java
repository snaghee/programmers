class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        char []my=my_string.toCharArray();
        char []is=is_suffix.toCharArray();
        int l=my.length-1;
        if (is.length > my.length) {
            return 0;
        }
        for(int i=is.length-1 ; i>=0; i-- ){
            if(my[l]!=is[i]){
                answer=0;
                break;
            }
            l--;
        }
        return answer;
    }
}