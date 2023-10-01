# 24482. 알고리즘 수업 - 깊이 우선 탐색 4

import sys
input = sys.stdin.readline
sys.setrecursionlimit(1000000)

def dfs(start, depth):
    visited[start] = depth

    for j in graph[start]:
        if visited[j] == -1:
            dfs(j, depth+1)

N, M, R = map(int, input().split())
graph = [[] for _ in range(N+1)]
visited = [-1] * (N+1)

for _ in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for i in graph:
    i.sort(reverse=True)

dfs(R, 0)

for i in visited[1:]:
    print(i)