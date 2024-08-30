class Solution {
    public int solution(int a, int b) {
        int aXorB = Integer.parseInt(a + "" + b);
        int doubleProduct = 2 * a * b;
        int answer = (aXorB >= doubleProduct) ? aXorB : doubleProduct;
        return answer;
    }
}
