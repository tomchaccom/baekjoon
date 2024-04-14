#include <stdio.h>

int main(void) {
    int t;
    scanf("%d", &t);  // 테스트 케이스 개수 입력
    
    while (t--) {
        int r;
        char s[21]; // 최대 문자열 길이는 20이므로 널 문자('\0') 고려하여 21로 설정
        
        scanf("%d %s", &r, s);  // 반복 횟수와 문자열 입력
        
        for (int i = 0; s[i] != '\0'; i++) {
            for (int j = 0; j < r; j++) {
                printf("%c", s[i]);  // 각 문자를 r번 반복하여 출력
            }
        }
        printf("\n");  // 줄 바꿈
    }
    
    return 0;
}