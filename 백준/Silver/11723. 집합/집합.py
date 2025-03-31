import sys

input = sys.stdin.readline


N = int(input())
ar = set()
result = []

for _ in range(N):
    
    text = input().strip()
    
    if " " in text:
        command, item = text.split(" ")
        item = int(item)
    else:
        command = text
    
    if command == "add":
        ar.add(item)   
    elif command == "check":
        print(1 if item in ar else 0)
    elif command == "remove":
        ar.discard(item)
    elif command == "toggle":
        if item in ar:
            ar.discard(item)
        else:
            ar.add(item)
    elif command == "all":
        ar = set(range(1,21))
    else: 
        ar.clear()
