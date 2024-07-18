#include <stdio.h>
#include <string.h>


typedef struct queue{
    int data[100000];
    int first;
    int rear;

}queue;

void init(queue *q){
    q->first = 0;
    q->rear = -1;
    
}
void push(queue *q, int item){
    q->data[++(q->rear)] = item;
}

int size(queue *q){
    return (q->rear - q->first + 1);
}
int empty(queue *q){
    if(q->first == (q->rear +1)){
        return 1;
    }else return 0;
}
int front(queue *q){
    if(empty(q) == 1){
        return -1;
    }else return q ->data[(q->first)];
}
int pop(queue *q){
    if(empty(q) == 1){
        return -1;
    }else 
        return q ->data[(q->first)++];
}

int back(queue *q){
    if(empty(q) == 1){
        return -1;
    }else
        return q->data[q->rear];
}

int main(){

    struct queue que;
    init(&que);
    int test,item;
    char com[100];
    
    scanf("%d",&test);

    for(int i = 0; i < test; i++ ){
        scanf("%s",com);

        if(strcmp(com,"push") == 0){
            scanf("%d",&item);
            push(&que, item);
        }
        else if(strcmp(com, "pop") == 0){
            printf("%d\n",pop(&que));
        }
        else if(strcmp(com,"size") ==0){
            printf("%d\n",size(&que));
        }
        else if(strcmp(com,"empty") == 0){
            printf("%d\n", empty(&que));
        }
        else if(strcmp(com,"front") == 0){
            printf("%d\n", front(&que));
        }
        else if(strcmp(com,"back") == 0){
            printf("%d\n", back(&que));
        }

        }

       return 0;





    }



