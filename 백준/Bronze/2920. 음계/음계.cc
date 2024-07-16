#include <stdio.h>
#define Size 8

int main(){

    int music[Size];
    int count = 0;

    for(int i = 0; i < Size; i++ ){
        scanf("%d",&music[i]);
    }

    for(int k = 0; k < Size; k++){
        if(music[k] == k+1 ){
            count++;
        }
    }
     for(int t = 0; t < Size; t++){
        if(music[t] == 8-t ){
            count--;
        }
    }

    if(count == 8){
        printf("ascending");
    }
    else if(count == -8){
        printf("descending");
    }else
        printf("mixed");

    return 0;

}