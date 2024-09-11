class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        answer=hp/5;
        var c= hp%5;
        var a= c/3;
        var b= c%3;
        answer+=a+b;
        return answer
    }
}