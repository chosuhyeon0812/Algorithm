# 1978. 소수 찾기
n = int(input())
num = map(int, input().split())
cnt = 0

for i in num:
    result = True
    for j in range(2, i):
        if i % j == 0:
            result = False
            break
    if i > 1 and result:
        cnt += 1
        
print(cnt)

