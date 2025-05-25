import sys
input = sys.stdin.readline

s = input().strip()
t = input().strip()


for i in s:
    if i in t:
        t = t.replace(i,"")

print(t)