#include<stdio.h>

int main(){
    
    int size;
    
    scanf("%d",&size);
    
    int a[size][2];
    
    for(int i = 0; i < size; i++){
        
        scanf("%d",&a[i][0]);
        scanf("%d",&a[i][1]);
        
    }
    
    for(int j = 0; j < size; j++){
        
        printf("%d",a[j][0] + a[j][1]);
        printf("\n");
        
    }
    
    return 0;    
    
    
    
}