import sys

input = sys.stdin.readline

N, M = map(int, input().strip().split())
coin = []

for _ in range(N):
    coin.append(int(input().strip()))

coin.sort()
coin.reverse()

count =0

for i in coin:
    if M % i != 0 and M >= i:
        count += M // i
        M = M % i 

    elif M % i == 0:
        count += M // i
        break

print(count)