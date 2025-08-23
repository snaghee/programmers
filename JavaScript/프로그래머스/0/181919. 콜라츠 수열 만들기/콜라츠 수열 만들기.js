function solution(n) {
    var answer = [n];
    var a=n;
    while(a!=1){
        a=(a%2==0)?(a/2):(3*a+1);
        answer.push(a);
    }
    return answer;
}