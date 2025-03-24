import sys

input = sys.stdin.readline

n = input().strip()
m = input().strip()
k = input().strip()

fb = []

fb.append(n)
fb.append(m)
fb.append(k)


# 일단 숫자를 먼저 찾아서 기준을 잡자 

arr = []

arr.append(n.isdigit())
arr.append(m.isdigit())
arr.append(k.isdigit())


for i in range(len(arr)):
    if arr[i] == True:
        num = int(fb[i])
        num = num +  (len(arr) - i)
        break


if num % 3 == 0 and num % 5 != 0:
    print("Fizz")
elif  num % 5 == 0 and num % 3 != 0:
    print("Buzz")
elif num % 3 == 0 and num % 5 == 0:
    print("FizzBuzz")
else:
    print(num)