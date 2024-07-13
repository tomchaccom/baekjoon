#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int a, b, c;
    int result;
    char s[9] = {}; // 문자열을 저장할 배열

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    result = a + b - c;
    printf("%d \n", result);

    // 정수를 문자열로 변환하여 s에 연결
    sprintf(s, "%d%d", a, b);

    // 문자열 s에서 정수로 변환하여 계산
    result = atoi(s);
    printf("%d", result - c);

    return 0;
}
