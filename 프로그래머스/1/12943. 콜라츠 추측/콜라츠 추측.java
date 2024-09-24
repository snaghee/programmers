class Solution {
    public int solution(int num) {
        int answer = 0;
        long nu=num;
        if (nu == 1) {
            return 0;
        }

        for (int i = 1; i <= 500; i++) {
            if (nu % 2 == 0) { 
                nu /= 2;
            } else {
                nu = nu * 3 + 1;
            }

            if (nu == 1) {
                return i;
            }
        }

        return -1;
    }
}
