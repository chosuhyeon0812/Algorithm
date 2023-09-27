# 10026. 적록색약
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(x, y):
    visited[x][y] = True
    current = seed[x][y]

    for k in range(4):
        di = x + dx[k]
        dj = y + dy[k]
        if 0 <= di < N and 0 <= dj < N:
            if visited[di][dj] == False and seed[di][dj] == current:
                dfs(di, dj)

N = int(input())
seed = [list(input()) for _ in range(N)]
visited = [[False] * N for _ in range(N)]

see_3 = 0
see_2 = 0


# 적록 색약 아닌 사람이 봤을 때
for i in range(N):
    for j in range(N):
        if visited[i][j] == False:
            dfs(i, j)
            see_3 += 1

# 적록 색약인 사람이 본다면... 빨간색으로 그린으로 바꿔주기(같은 색으로 인식)
for i in range(N):
    for j in range(N):
        if seed[i][j] == "R":
            seed[i][j] = "G"


visited = [[False] * N for _ in range(N)]

for i in range(N):
    for j in range(N):
        if visited[i][j] == False:
            dfs(i, j)
            see_2 += 1

print(see_3, see_2)

