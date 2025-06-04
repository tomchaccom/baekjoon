import sys
input = sys.stdin.readline

case = int(input())
discord = []


for i in range(case):
    start, end = map(int, input().split())
    discord.append((start, end))

discord = sorted(discord,key = lambda x:(x[1],x[0]))


end_time = 0
count = 0

for j in discord:
    if j[0] >= end_time:
        end_time = j[1]
        count += 1

print(count)
