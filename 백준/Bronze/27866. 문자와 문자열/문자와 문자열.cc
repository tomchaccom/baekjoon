#include<stdio.h>
#include<string.h>

int main(void){
    
    char c[1000];
    int n;
    
    scanf("%s",c);
    scanf("%d",&n);
    
    printf("%c",c[n-1]);
    
    return 0;
    
    
}