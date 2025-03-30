result = []

while True:
    
    st = input()
    stack = []
    
    if st == ".":
        break

    for i in range(len(st)):
        
        if st[i] == "(" or st[i] == "[":
            stack.append(st[i])
        elif st[i] == ")":
            if len(stack) != 0 and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(st[i])
        elif st[i] == "]":
            if len(stack) != 0 and stack[-1] == "[":
                stack.pop()
            else:
                stack.append(st[i])
    
    if len(stack) == 0:
        result.append("yes")
    else:
        result.append("no")
        
for t in result:
    print(t)