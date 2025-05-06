# 백준 17219
import sys 

input = sys.stdin.readline

N,M = map(int, input().strip().split())

dic = {}
problem = []

for i in range(N):
    site, pw = input().strip().split()
    dic[site] = pw


for j in range(M):
    problem.append(input().strip())

for p in problem:
    print(dic[p])