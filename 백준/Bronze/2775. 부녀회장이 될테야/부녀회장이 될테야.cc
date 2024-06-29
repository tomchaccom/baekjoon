#include <stdio.h>

int living(int k1, int n1);


int main(void){
    
    int test, k, n, people;
   
    // printf("test case 의 횟수를 입력하시오:");
    scanf("%d",&test);
    
    for(int i = 0; i < test; i++){
    	
    	
        // printf("거주할 층과 호수를 입력하시오\n");
        scanf("%d",&k); // 층 입력
        scanf("%d",&n); // 호수 입력 
        people = living(k,n);
        printf("%d\n",people);
        
       
   
}

 return 0;
}

int living(int k1, int n1){

	int live[k1 +1][n1 +1]; 
	
	for(int i = 1; i <= n1; i++){
		live[0][i] = i;
	}
	
	
	for(int i = 1; i <= k1; i++){
		for(int t = 1 ; t <=n1; t++){
			
		if(t != 1)
			live[i][t] = live[i][t-1] + live[i-1][t];
		
		else
			live[i][t] = 1;
		
	
	}
	
	
	}
	return live[k1][n1];
}



