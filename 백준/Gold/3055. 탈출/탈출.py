# 3055.탈출
from collections import deque
def bfs():
    dx = [0, 1, 0, -1]
    dy = [-1, 0, 1, 0]

    while water:
        x, y = water.popleft()
        for k in range(4):
            di = x + dx[k]
            dj = y + dy[k]
            if 0 <= di < R and 0 <= dj < C and visited[di][dj] == -1:
                if mapping[di][dj] != 'X' and mapping[di][dj] != 'D':
                    visited[di][dj] = visited[x][y] + 1
                    water.append((di, dj))

    while goseum:
        x, y = goseum.popleft()
        for k in range(4):
            di = x + dx[k]
            dj = y + dy[k]
            if 0 <= di < R and 0 <= dj < C:
                if mapping[di][dj] == '.':
                    if visited[di][dj] > mapping[x][y] + 1 or visited[di][dj] == -1:
                        mapping[di][dj] = mapping[x][y] + 1
                        goseum.append((di, dj))

                if mapping[di][dj] == 'D':
                    return mapping[x][y] + 1

    return "KAKTUS"

R, C = map(int, input().split())
mapping = [list(map(str, input())) for _ in range(R)]
visited = [[-1] * C for _ in range(R)]
goseum = deque()
water = deque()

for i in range(R):
    for j in range(C):
        if mapping[i][j] == 'S':
            goseum.append((i, j))
            mapping[i][j] = 0

        if mapping[i][j] == '*':
            water.append((i, j))
            visited[i][j] = 0

print(bfs())
