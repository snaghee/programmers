import java.util.stream.Stream;
class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num=0;
        int[] xArr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<xArr.length; i++){
            num+=xArr[i];
        }
        if(x%num==0)answer=true;
        return answer;
    }
}