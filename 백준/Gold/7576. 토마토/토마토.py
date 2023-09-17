# 7576. 토마토
from collections import deque

# M :가로칸 수 / N : 세로칸 수
M, N = map(int, input().split())
tomato = [list(map(int, input().split())) for _ in range(N)]
q = deque()
result = 0
for i in range(N):
    for j in range(M):
        if tomato[i][j] == 1:
            q.append([i, j])
def bfs():
    dx = [0, 1, 0, -1]
    dy = [-1, 0, 1, 0]

    while q:
        a, b = q.popleft()
        for k in range(4):
            di = a + dx[k]
            dj = b + dy[k]
            if 0 <= di < N and 0 <= dj < M:
                if tomato[di][dj] == 0:
                    tomato[di][dj] = tomato[a][b] + 1
                    q.append((di, dj))

bfs()
for i in tomato:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    result = max(result, max(i))

print(result-1)