#include <stdio.h>

int main(void){
    
    int n;
    int i;
    int j;
    
    scanf("%d",&n);
    
    for(i = 1 ; i < n + 1; i ++){
        for(j = n - i; j > 0; j--)
             printf(" ");
        for(int k = i; k!= 0; k--)
        	printf("*");
            
        printf("\n");
        
        
    }
    
    
    return 0;
    
    
    
}