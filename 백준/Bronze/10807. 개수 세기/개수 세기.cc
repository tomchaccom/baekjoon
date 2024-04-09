#include <stdio.h>

int main(void){
    
	int size;
    int a[size];
    int count = 0;
    int search;
    
    scanf("%d", &size);
    
    for(int i = 0; i < size; i++){
        
        scanf("%d", &a[i]);
        
    }
    scanf("%d", &search);
    
    for(int j = 0;j < size;j++){
        if(a[j] == search)
            count++;
        
    }
  
   printf("%d",count);
   return 0;
    
    
}