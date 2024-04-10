#include<stdio.h>

int main(void){
    
    int a[8];
    int max = 0;
    
    for(int i = 0;i < 9;i++){
        scanf("%d",&a[i]);
        
    }
    
   for(int j = 1; j < 9; j++){
       if(a[max] <= a[j])
           max = j;
       
   }
    printf("%d\n%d",a[max],max+1);
    
    return 0;
    
    
    
}