class Solution {
    public String solution(String s) {
         StringBuilder answer = new StringBuilder();
        int num=0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (num % 2 == 0) {
                    answer.append(Character.toUpperCase(ch));
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
                num++;
            } else {
                answer.append(ch);
                num=0;
            }
            
        }
        return answer.toString();
    }
}