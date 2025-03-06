import sys

input = sys.stdin.readline

n = int(input().strip())

# print(n) 딕셔너리가 자바와 비슷하게 똑같은 키를 저장하지 않음. 리스트가 맞는듯

arr = [] 

for _ in range(n):
   age, name = list(input().strip().split(" "))
   arr.append((int(age) , name))


sorted_arr = sorted(arr, key = lambda x : x[0])

for k in sorted_arr:
   print(k[0], k[1])
   



