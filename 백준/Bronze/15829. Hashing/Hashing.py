    
n = int(input())

hash = input().strip()

# 0~ n-1까지 ai * r^i mod M
# r= 31M 1234567891

sum = 0

for i in range(len(hash)):
    sum += (ord(hash[i]) - 96) * (31 ** i)
    
if sum >= 1234567891:
    sum = sum % 1234567891
    
print(sum)