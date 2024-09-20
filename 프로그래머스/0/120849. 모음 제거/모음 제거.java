class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] m= my_string.toCharArray();
        for(int i=0; i<m.length; i++){
            if(m[i]!='a'&&m[i]!='e'&&m[i]!='i'&&m[i]!='o'&&m[i]!='u'){
                answer+=m[i];
            }
        }
        return answer;
    }
}