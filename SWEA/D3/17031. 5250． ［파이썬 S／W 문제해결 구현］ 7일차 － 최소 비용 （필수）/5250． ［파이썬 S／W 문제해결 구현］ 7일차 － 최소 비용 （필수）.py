# 5250. 최소 비용
def mn_cost():
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    mn = 100001
    # 최단 거리 배열..
    dist = [[mn]* N for i in range(N)]
    dist[0][0] = 0
    q = []
    q.append((0, 0))
    while q:
        t = q.pop(0)
        for k in range(4):
            di = t[0] + dx[k]
            dj = t[1] + dy[k]
            if 0 <= di < N and 0 <= dj < N:
                distance = 0
                # 새로운 지역이 현재 지역보다 높으면 새로운 비용으로 갱신
                if fuel[di][dj] > fuel[t[0]][t[1]]:
                    distance = fuel[di][dj] - fuel[t[0]][t[1]]
                if dist[di][dj] > dist[t[0]][t[1]] + distance + 1:
                    dist[di][dj] = dist[t[0]][t[1]] + distance + 1
                    q.append((di, dj))

    return dist[N - 1][N - 1]


T =int(input())
for tc in range(1, T+1):
    N = int(input())
    fuel = [list(map(int, input().split())) for _ in range(N)]

    result = mn_cost()
    print(f'#{tc} {result}')