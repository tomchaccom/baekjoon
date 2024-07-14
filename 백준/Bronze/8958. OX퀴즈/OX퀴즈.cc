#include <stdio.h>
#include <string.h>

// ox 의 갯수를 확인하고 연속된 o의 점수를 산정하는 프로그램
// 연속된 o는 값이 1씩 증가하는 반면, 그렇지 않은 것은 그냥 1로 계산한다.

int main(){ 

    int test;
    int count, sum;
    char s[100];

    scanf("%d",&test);
    getchar();

    for(int x = 1; x <= test; x++){
        
        fgets(s, sizeof(s), stdin);
        count = 1;
        sum = 0;

         for(int i = 0; i < strlen(s); i++){
             if(s[i] == 'O'){
                  sum += count;
                   count++;
             }
             else if(s[i] == 'X'){
               count = 1;
            }
        }
        printf("%d\n",sum);
    }

    return 0;



}