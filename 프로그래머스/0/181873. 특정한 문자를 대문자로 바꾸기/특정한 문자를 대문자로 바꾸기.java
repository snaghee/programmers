class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        char target = alp.charAt(0);  // alp는 한 글자이므로 첫 번째 문자만 가져옴
        
        for (char c : my_string.toCharArray()) {
            if (c == target) {
                answer.append(Character.toUpperCase(c));  
            } else {
                answer.append(c);  
            }
        }
        
        return answer.toString();  
    }
}
