# 10974. 모든 순열
def dfs(L):
    if L == N:
        print(*result)
    else:
        for i in range(N):
            if checked[i] == 0:
                result[L] = num[i]
                checked[i] = 1
                dfs(L+1)
                checked[i] = 0

N = int(input())
num = []
for i in range(1, N+1):
    num.append(i)
result = [0] * N
# 방문체크
checked = [0] * N

dfs(0)

