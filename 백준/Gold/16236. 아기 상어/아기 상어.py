# 16236. 아기상어
from collections import deque
def bfs(x, y):
    global size
    visited = [[False] * N for _ in range(N)] # 방문체크
    distance = [[0] * N for _ in range(N)] # 시간 얼마나 걸렸는지
    q = deque()
    q.append((x, y))
    temp = []
    while q:
        a, b = q.popleft()

        for k in range(4):
            di = a + dx[k]
            dj = b + dy[k]
            if 0 <= di < N and 0 <= dj < N:
                # 이동하려면 같거나 작고 방문 안하고
                if fish[di][dj] <= size and not visited[di][dj]:
                    visited[di][dj] = True
                    distance[di][dj] = distance[a][b] + 1
                    q.append((di, dj))

                    # 먹으려면 상어 크기보다 작고 0이 아니고
                    if fish[di][dj] < size and fish[di][dj] != 0:
                        temp.append((di, dj, distance[di][dj]))
    # 람다 어렵당
    temp.sort(key= lambda x : (x[2], x[0], x[1]))
    return temp

N = int(input())
fish = [list(map(int, input().split())) for _ in range(N)]

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
cnt = 0
shark_x, shark_y, size = 0, 0, 2 # 아기상어의 위치와 크기
for i in range(N):
    for j in range(N):
        if fish[i][j] == 9:
            fish[i][j] = 0
            shark_x = i
            shark_y = j

ans = 0
while True:
    shark = bfs(shark_x, shark_y)
    if len(shark) == 0:
        print(ans)
        exit()

    shark_x, shark_y, time = shark[0]

    cnt += 1
    if size == cnt:
        cnt = 0
        size += 1

    fish[shark_x][shark_y] = 0
    ans += time


