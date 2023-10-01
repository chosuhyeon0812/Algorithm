#24446. 알고리즘 수업 3 - 너비 우선 탐색
import sys
input = sys.stdin.readline
from collections import deque

def bfs(start):
    q = deque()
    q.append(R)
    visited[start] = 0

    while q:
        t = q.popleft()
        for i in graph[t]:
            if visited[i] == -1:
                visited[i] = visited[t] + 1
                q.append(i)

N, M, R = map(int, input().split())
graph = [[] for _ in range(N+1)]
visited = [-1] * (N+1)

for _ in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

bfs(R)
for i in visited[1:]:
    print(i)