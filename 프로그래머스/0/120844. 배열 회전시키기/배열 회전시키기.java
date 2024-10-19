class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int a = 0;

        if (direction.equals("right")) {
            answer[a] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                a++;
                answer[a] = numbers[i];
            }
        } else if (direction.equals("left")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[a] = numbers[i];
                a++;
            }
            answer[a] = numbers[0];
        }

        return answer;
    }
}
