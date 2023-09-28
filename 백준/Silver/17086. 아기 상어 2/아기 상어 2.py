# 17086. 아기 상어 2
import sys
input = sys.stdin.readline
from collections import deque

# def bfs(i, j):
#     q = deque([(i, j, 0)])
#     visited[i][j] = True
#     dx = [-1, 0, 1, 1, 1, 0, -1, -1]
#     dy = [-1, -1, -1, 0, 1, 1, 1, 0]
#     while q:
#         x, y, distance = q.popleft()
#         for k in range(8):
#             di = x + dx[k]
#             dj = y + dy[k]
#             if 0 <= di < N and 0 <= dj < M and not visited[di][dj]:
#                 if shark[di][dj] == 0:
#                     visited[di][dj] = True
#                     q.append((di, dj, distance+1))
#
#                 else:
#                     return distance + 1

N, M = map(int, input().split())
shark = [list(map(int, input().split())) for _ in range(N)]
result = 0

def bfs(i, j):
    visited = [[False] * M for _ in range(N)]
    q = deque([(i, j, 0)])
    visited[i][j] = True
    dx = [-1, 0, 1, 1, 1, 0, -1, -1]
    dy = [-1, -1, -1, 0, 1, 1, 1, 0]
    while q:
        x, y, distance = q.popleft()
        for k in range(8):
            di = x + dx[k]
            dj = y + dy[k]
            if 0 <= di < N and 0 <= dj < M and not visited[di][dj]:
                if shark[di][dj] == 0:
                    q.append((di, dj, distance+1))
                    visited[di][dj] = True

                else:
                    return distance + 1

for i in range(N):
    for j in range(M):
        if shark[i][j] == 0:
            result = max(result, bfs(i, j))

print(result)