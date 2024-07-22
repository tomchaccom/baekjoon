#include <stdio.h>

void triangle(int ,int ,int );


int main(){

	int a,b,c;

	while(1){
		scanf("%d %d %d", &a, &b, &c);
		
		if(a == 0 && b == 0 && c ==0){
			break;
		}
		triangle(a,b,c);

	}
	return 0;


}

void triangle(int n1, int n2, int n3){ // 정렬시켜서 하는게 나을 듯 

	int num[3] = {n1,n2,n3};
	// 초기화 시켜두고 큰거를 맨뒤에 넣고 순서를 변경하자
	int temp;
	int max = 0 ;

	for(int k = 1; k < 3; k++){
		if(num[max] <= num[k]){
				max = k;
		}

	}
	temp = num[0];
	num[0] = num[max];
	num[max] = temp;

	if( num[0]*num[0]  == (num[1]*num[1] + num[2]*num[2]))  
		printf("right\n");
	else printf("wrong\n");
	
}