a,b,c = map(int, input().split())

if a == b == c:
    print(10000 + a * 1000)
elif a == b or b == c or c == a:
    if a == b:
        print(1000 + a * 100)
    elif b == c:
        print(1000 + b * 100)
    else:
        print(1000 + c * 100)
else:
    t = max(a,b,c)
    print(t*100)