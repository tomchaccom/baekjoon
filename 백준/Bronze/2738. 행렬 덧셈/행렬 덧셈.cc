#include <stdio.h>

int main(void){

    int m, n;


    scanf("%d %d",&m,&n); 
    int mat1[m][n];
    int mat2[m][n];
    int sum[m][n];

    for(int t = 0; t < m; t++){
        for( int k= 0; k < n; k++){
            scanf("%d", &mat1[t][k]);
            
        }
    }
      for(int t = 0; t < m; t++){
        for( int k= 0; k < n; k++){
            scanf("%d", &mat2[t][k]);
            
        }
    }


    for(int i = 0; i < m; i++){

        for(int j = 0; j < n; j++ ){
          
            sum[i][j] = mat1[i][j] + mat2[i][j];
            printf("%d ",sum[i][j]);

        }
        printf("\n");

    }

return 0;
    





}