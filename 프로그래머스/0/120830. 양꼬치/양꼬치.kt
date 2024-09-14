class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var a : Int =0
        answer=n*12000
        a=n/10*2000
        answer=answer+k*2000-a
        return answer
    }
}