#include <stdio.h>

int main(void){
    
    int a;
    int b;
    
    scanf("%d",&a);
    scanf("%d",&b);
    
    printf("%d\n", a *(b % 10));
    printf("%d\n", a *int((b % 100)/10));
    printf("%d\n", a *(b/100));
    printf("%d",a*b);
    
    return 0;
    
    
    
}