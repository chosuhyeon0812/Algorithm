# 6593. 상범 빌딩

import sys
from collections import deque
dx = [1, -1, 0, 0, 0, 0]
dy = [0, 0, 1, -1, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

def bfs(l, r, c):
    global building
    q = deque()
    q.append((l, r, c))
    distance[l][r][c] = 1

    while q:
        x, y, z = q.popleft()

        for i in range(6):
            di = x + dx[i]
            dj = y + dy[i]
            dk = z + dz[i]

            if 0 <= di < L and 0 <= dj < R and 0 <= dk < C:
                if building[di][dj][dk] == "E":
                    return distance[x][y][z]

                if building[di][dj][dk] == "." and distance[di][dj][dk] == 0:
                    distance[di][dj][dk] = distance[x][y][z] + 1
                    q.append((di, dj, dk))

    return -1

while True:

    L, R, C = map(int, input().split())
    if L == R == C == 0:
        break

    building = []
    for _ in range(L):
        temp = [input() for _ in range(R)]
        input() # 빈줄
        building.append(temp)

    distance = [[[0] * C for _ in range(R)] for _ in range(L)]


    for l in range(L):
        for r in range(R):
            for c in range(C):
                if building[l][r][c] == "S":
                    result = bfs(l, r, c)

                    if result != -1:
                        print(f"Escaped in {result} minute(s).")

                    else:
                        print("Trapped!")