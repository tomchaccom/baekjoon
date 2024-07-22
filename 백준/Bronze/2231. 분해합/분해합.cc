#include <stdio.h>

int constructer(int n) {
    int sum = n;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

int main(void) {
    int num, res = 0;
    scanf("%d", &num);

    // num의 자릿수를 계산
    int temp = num, digitCount = 0;
    while (temp > 0) {
        digitCount++;
        temp /= 10;
    }

    // 가능한 최소 생성자의 범위 설정
    int start = num - 9 * digitCount;
    if (start < 1) start = 1;

    // 범위 내에서 생성자 찾기
    for (int i = start; i < num; i++) {
        if (num == constructer(i)) {
            res = i;
            break;
        }
    }

    printf("%d\n", res);
    return 0;
}
