#include<stdio.h>

int main(void){
    
    int a,b,c,d,e;
    int number;
    
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    
    number = (a*a + b*b + c*c +d*d + e*e) % 10;
    printf("%d",number);
    return 0;
    
    
}