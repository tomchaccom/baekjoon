n = int(input())
result = []

for i in range(n):
    st = input()

    result.append(st[0] + st[-1])

for t in result:
    print(t)