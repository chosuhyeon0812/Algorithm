# 2178. 미로 탐색
import sys
from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
def bfs(x, y):
    q = deque()
    q.append((x, y))

    while q:
        a, b = q.popleft()

        for k in range(4):
            di = a + dx[k]
            dj = b + dy[k]

            if 0 <= di < N and 0 <= dj < M and miro[di][dj] == 1:
                miro[di][dj] = miro[a][b] + 1
                q.append((di, dj))

    return miro[N-1][M-1]

N, M = map(int, input().split())
miro = [list(map(int, input().rstrip())) for _ in range(N)]

result = bfs(0,0)
print(result)
