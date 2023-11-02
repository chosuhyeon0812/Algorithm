# 18352. 특정 거리의 도시 찾기
import sys
input = sys.stdin.readline
import heapq
INF = float('inf')

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        if dist > distance[now]:
            continue

        for i in road[now]:
            value = dist + i[1]
            if value < distance[i[0]]:
                distance[i[0]] = value
                heapq.heappush(q, (value, i[0]))

N, M, K, X = map(int, input().split())
road = [[] for _ in range(N+1)]
distance = [INF] * (N+1)
for _ in range(M):
    s, e = map(int,input().split())
    road[s].append((e, 1))
dijkstra(X)

cnt = 0
for i in range(N+1):
    if distance[i] == K:
        cnt += 1
        print(i)

if cnt == 0:
    print(-1)