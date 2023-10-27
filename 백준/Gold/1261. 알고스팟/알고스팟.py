# 1261. 알고스팟

import heapq

M, N = map(int, input().split())
miro = [list(map(int, input())) for _ in range(N)]
distance = [[1e10] * M for _ in range(N)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


heap = []
heapq.heappush(heap, (0, 0, 0))
distance[0][0] = 0
while heap:
    wall, r, c = heapq.heappop(heap)

    if wall > distance[r][c]:
        continue

    for i in range(4):
        di = r + dx[i]
        dj = c + dy[i]

        if di < 0 or di >= N or dj < 0 or dj >= M:
            continue

        if wall + miro[di][dj] < distance[di][dj]:
            distance[di][dj] = wall + miro[di][dj]
            heapq.heappush(heap, (distance[di][dj], di, dj))


print(distance[N - 1][M - 1])