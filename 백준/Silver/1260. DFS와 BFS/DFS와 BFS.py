# DFS
def DFS(V):
    visited_DFS[V] = 1 #방문처리
    DFS_result.append(V)
    for node in graph[V]:
        if not visited_DFS[node]:
            DFS(node)


# BFS
def BFS(V):
    queue = [V]
    visited_BFS[V] = 1 #방문처리
    while queue:
        V = queue.pop(0)
        BFS_result.append(V)
        for node in graph[V]:
            if not visited_BFS[node]:
                visited_BFS[node] = 1 # 방문처리
                queue.append(node)


N, M, V = map(int, input().split())

# 인접 리스트
graph = [[] for _ in range(N+1)]
for i in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for row in range(N+1):
    graph[row].sort()

# 방문
visited_DFS = [0]*(N+1)
visited_BFS = [0]*(N+1)

DFS_result = []
BFS_result = []

DFS(V)
BFS(V)

print(*DFS_result)
print(*BFS_result)