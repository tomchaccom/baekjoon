#include <stdio.h>

double max_avg(int size);

int main(){

	int sub;

	scanf("%d",&sub);
	printf("%lf",max_avg(sub));

	return 0;
}

double max_avg(int size){
	
	int score[size];
	double sum =0;
	int max = 0;

	for(int i = 0; i <size; i++){
		scanf("%d",&score[i]);
	}

	for(int k = 1; k < size; k++){
		if(score[max] <= score[k]){
			max = k;
		}
	}
	for(int j =0; j < size; j++){
		
		sum += (double)score[j]/(double)score[max]*100; 
	
	}

	return sum/size;



}