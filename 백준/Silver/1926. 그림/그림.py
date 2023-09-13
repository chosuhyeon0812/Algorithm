# 1926. 그림
from collections import deque
def dfs(a, b):
    canvas[a][b] = 0
    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]
    w = 1
    q = []
    q.append([a, b])
    while q:
        a, b = q.pop()
        for s in range(4):
            di = a + dx[s]
            dj = b + dy[s]
            if 0 <= di < n and 0 <= dj < m and canvas[di][dj] == 1:
                q.append([di, dj])
                canvas[di][dj] = 0
                w += 1
    return w

n, m = map(int, input().split())
canvas = [list(map(int, input().split())) for _ in range(n)]
cnt = 0
ans = 0
for i in range(n):
    for j in range(m):
        if canvas[i][j] == 1:
            cnt += 1
            ans = max(dfs(i, j), ans)


print(cnt)
print(ans)