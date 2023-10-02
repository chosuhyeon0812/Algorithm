# 24447. 알고리즘 수업 - 너비 우선 탐색 4
import sys
input = sys.stdin.readline
from collections import deque

def bfs(start, depth):
    q = deque()
    q.append(start)
    t[start] = 1
    order = 1
    visited[start] = depth

    while q:
        v = q.popleft()
        t.append(v)
        for i in graph[v]:
            if visited[i] == -1:
                order += 1
                q.append(i)
                t[i] = order
                visited[i] = visited[v]+1

N, M, R = map(int, input().split())
graph = [[] for _ in range(N+1)]
visited = [-1] * (N + 1)
t = [0] * (N + 1)
for _ in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for i in graph:
    i.sort()

bfs(R, 0)

# print(visited)
# print(t)

sum = 0
for i in range(1, N+1):
    if visited[i] == -1:
        continue
    sum += visited[i] * t[i]
print(sum)
