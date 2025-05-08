import sys

T = int(input())  # 테스트 케이스 수
answer = []

for _ in range(T):
    cloth = {}     # 카테고리별 의상 수 저장
    result = 1
    n = int(input())
    
    for _ in range(n):
        name, type = sys.stdin.readline().rstrip().split()
        if not type in cloth:
            cloth[type] = 1
        else:
            cloth[type] += 1

    for i in cloth:
        result *= (cloth[i] + 1)  # (해당 카테고리 옷 수 + 입지 않는 경우)

    answer.append(result -1)
   
for j in answer:
    print(j)