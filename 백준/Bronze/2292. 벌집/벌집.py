# 1           1
# 234567      6
# 8 ~ 19      12 
# 20~ 37      18 
# 38  61      24

# 6 개씩 늘어나는 형태임 

bee = int(input())
cross = 1

bee -= 1 # 시작과 끝을 포함해서 몇개의 방을 지나는지 

while True:
    if bee == 0:
        print(cross)
        break
    
    bee -= (6*cross)
    
    
    if bee < 0 and (bee * -1) < (6*cross):
        print(cross+1)
        break
    else:
        cross += 1