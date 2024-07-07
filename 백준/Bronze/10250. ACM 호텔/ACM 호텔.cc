#include <stdio.h>

int main(){

    int test, floor, room; // 테스트 케이스의 갯수 
    int h, w, n; // h는 층을 의미 , w는 호실을 의미, n 들어가는 사람의 수를 의미
    //printf("테스트 케이스 입력: ");
    scanf("%d", &test); 
	//printf("\n");
	
    for(int i = 0; i < test; i++){
        //printf("호텔의 크기 및 들어온 손님의 순서 입력: ");
        scanf("%d %d %d", &h,&w,&n);

      	floor = n % h;
		if(floor == 0){
			floor = h;
		}  
		
		room = (n-1)/h + 1;
		
		printf("%d\n", floor* 100 + room);
		  

    }

    return 0;
    
}
