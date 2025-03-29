N = int(input())
data = []
rank = []

for _ in range(N):
    x,y = map(int, input().strip().split(" "))
    data.append((x,y))
    
    
for i in range(N):
    count = 0
        
    for j in range(N):
        if i != j:
            if data[i][0] < data[j][0] and data[i][1] < data[j][1]:
                count +=1
    rank.append(count +1)
        
for d in rank:
    print(d , end=" ")