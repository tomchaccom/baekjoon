#include <stdio.h>
#include <string.h>

int main(){

    // baekjoon 알파벳 순서대로 나열 abejknoo
    // 정렬된 알파벳의 순서를 따라 인덱스를 저장, 그러면 아스키 코드 값을 인자로 전달하여 그 인덱스를 반환 중첩 반복문 사용?

    char str [100];
    int sort[26] = {0};
    int length;
    char index;


    scanf("%s",&str);
    length = strlen(str);

   for(int k = 0; k < 26; k++){
        
        for(int t = 0; t < length; t++){
            index = 'a';
            
            if(str[t] == (index + k)){
                sort[k] = t;
                break;

            }else
                sort[k] = -1;
           
        } 
        printf("%d ", sort[k]);
    
   }
   
    


    return 0;

}