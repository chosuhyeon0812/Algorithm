# 1916. 최소비용 구하기
import sys
import heapq
input = sys.stdin.readline
INF = 1e8

N = int(input())
dist = [INF] * (N+1)
edge = [[] for _ in range(N+1)]
M = int(input())
for _ in range(M):
    s, e, cost = map(int, input().split())
    edge[s].append([cost, e])
start, end = map(int, input().split())

dist[start] = 0
heap = [[0, start]]

while heap:
    ew, ev = heapq.heappop(heap)
    if dist[ev] < ew:
        continue

    for nw, nv in edge[ev]:
        if dist[nv] > ew + nw:
            dist[nv] = ew + nw
            heapq.heappush(heap, [dist[nv], nv])

# print(dist)
print(dist[end])