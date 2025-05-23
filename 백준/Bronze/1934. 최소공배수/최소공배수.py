import sys
input=sys.stdin.readline
t=int(input())

def mx(a,b):#최대공약수 구하기
    if b==0:
        return a
    else:
        return mx(b,a%b)

for i in range(t):
    a,b=map(int,input().split())
    print((a*b)//mx(a,b))