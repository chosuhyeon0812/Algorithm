import sys
import heapq

INF = 1e9
input = sys.stdin.readline

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance = [INF] * (N + 1)
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue

        for i in road[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance

N, M, X = map(int, input().split())
road = [[] for _ in range(N + 1)]

for _ in range(M):
    s, e, time = map(int, input().split())
    road[s].append((e, time))

max_time = 0
for i in range(1, N + 1):
    if i == X:
        continue

    go_time = dijkstra(i)[X]
    back_time = dijkstra(X)[i]
    total_time = go_time + back_time
    max_time = max(max_time, total_time)

print(max_time)
