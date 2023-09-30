# 1260. DFS와 BFS
from collections import deque

def dfs(start):
    visited[start] = True
    print(start, end=" ")

    for i in graph[start]:
        if not visited[i]:
            dfs(i)

def bfs(start):
    q = deque()
    q.append(start)
    visited2[start] = True

    while q:
        t = q.popleft()
        print(t, end = ' ')

        for i in graph[t]:
            if not visited2[i]:
                visited2[i] = True
                q.append(i)


N, M, V = map(int, input().split())
graph = [[] for _ in range(N+1)]
visited = [False] * (N + 1)
visited2 = [False] * (N + 1)
for _ in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for i in graph:
    i.sort()


dfs(V)
print()
bfs(V)
