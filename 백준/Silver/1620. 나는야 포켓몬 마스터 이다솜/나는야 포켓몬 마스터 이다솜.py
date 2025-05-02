import sys

input = sys.stdin.readline

N,M = map(int, input().split(" "))

pocket = {}
problem = []

for i in range(1,N+1):
    po = input().strip()

    pocket[i] = po
    pocket[po] = i


for j in range(M):
    problem.append(input().strip())

for k in problem:
    if k.isdigit():
        print(pocket[int(k)])
    else:
        print(pocket[str(k)])






