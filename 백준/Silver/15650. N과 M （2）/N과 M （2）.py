# 15650. N과 (2)
def dfs(L, end):
    if L == M:
        print(*result)
    else:
        for i in range(end, len(num)):
            result[L] = num[i]
            dfs(L+1, i+1)

N, M = map(int, input().split())
num = []
for i in range(1, N+1):
    num.append(i)
result = [0] * M
dfs(0, 0)
