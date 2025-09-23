import sys 
input = sys.stdin.readline

case = int(input().strip())

for _ in range(case):
    func = input().strip()   
    num = int(input())    
    
    numbers_str = input().strip()[1:-1] 
    if numbers_str == "":                 
        numbers = []
    else:
        numbers = list(map(int, numbers_str.split(",")))

    reversed_flag = False  
    error_flag = False    

    for command in func:
        if command == "R":
            reversed_flag = not reversed_flag
        elif command == "D":
            if len(numbers) == 0:
                print("error")
                error_flag = True
                break
            else:
                if reversed_flag:
                    numbers.pop()    
                else:
                    numbers.pop(0)   

    if not error_flag:
        if reversed_flag:
            numbers.reverse()
        print("[" + ",".join(map(str, numbers)) + "]")
