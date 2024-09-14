#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
        int a=0;
        answer=n*12000;
        a=n/10*2000;
        answer=answer+k*2000-a;
        return answer;
}