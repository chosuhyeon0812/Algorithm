# 2407. 조합

N, M = map(int, input().split())
num =[]
result = 1
for i in range(1, N+1):
    num.append(i)
num = num[::-1]
for k in range(M):
    result *= num[k]
    result //= k+1
print(result)