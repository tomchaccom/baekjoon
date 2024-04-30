#include<stdio.h>

int main(){
    
    int n,k;
    int t = 1;
    
    scanf("%d %d",&n,&k);
    
    
    for(int j = 1;j <= k; j++){
        t = (t * n) / j;
        n--;
    }
    
    
    printf("%d",t);
    
}