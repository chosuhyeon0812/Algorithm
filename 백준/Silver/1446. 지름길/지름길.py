# 1446. 지름길
import sys
import heapq
input = sys.stdin.readline
INF = 1e9

n, d = map(int, input().split())
graph = [[] for _ in range(d + 1)]
distance = [INF] * (d + 1)

for i in range(d):
    graph[i].append((i + 1, 1))

# 지름길 있는 경우 인접 리스트에 추가해주기
for _ in range(n):
    s, e, l = map(int, input().split())
    # 마지막 도착지점이 실제 고속도로 보다 멀면 넘긴다
    if e > d:
        continue
    graph[s].append((e, l))

# print(graph)
distance[0] = 0
heap = [[0, 0]]
while heap:
    dist, now = heapq.heappop(heap)

    if dist > distance[now]:
        continue

    for i in graph[now]:
        mn_dist = dist + i[1]
        if mn_dist < distance[i[0]]:
            distance[i[0]] = mn_dist
            heapq.heappush(heap, (mn_dist, i[0]))

print(distance[d])