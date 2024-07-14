#include <stdio.h>
#include <string.h>

#define size 10

int main(){

    int a,b,c,result;
    char str[100];
    int count[size] = {0};
    int index;

    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);

    result = a *b *c;
    sprintf(str,"%d",result);

    for(int i= 0; i < strlen(str) ;i++){
            count[str[i] -'0']++;

    }

    for(int t =0; t < size; t++){
        printf("%d\n", count[t]);
    }

    return 0;


}