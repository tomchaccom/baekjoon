#include <stdio.h>

int prime(int x);

int main(){

	int test, count = 0;
	int num[100];

	scanf("%d",&test);

	for(int i = 0; i < test; i++){
		scanf("%d",&num[i]);
	// 소수의 정의 1과 자기 자신으로만 나누어지는 수 
		if(prime(num[i])){
			count++;
		}
	}
	printf("%d",count);
	return 0;
}

int prime(int x){
	
	int dec = 0;

	for(int i = x; i > 0; i-- ){
		if(x % i == 0){
			dec++;
		}

	}
	if(dec == 2){
		return 1;
	}else return 0;
}