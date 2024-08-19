import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i += 2) {
            count++;
        }
        
        int[] ans = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i += 2) {
            ans[index++] = i;
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}
