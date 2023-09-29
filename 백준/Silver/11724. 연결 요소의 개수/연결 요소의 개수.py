# 11724. 연결 요소의 개수
import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000)

def dfs(start):
    visited[start] = 1
    for j in connected[start]:
        if visited[j] == 0:
            visited[j] = 1
            dfs(j)

N, M = map(int, input().split())
visited = [0] * (N+1)
connected = [[] for _ in range(N+1)]
for _ in range(M):
    s, e = map(int, input().split())
    connected[s].append(e)
    connected[e].append(s)

cnt = 0
for i in range(1, N+1):
    if visited[i] == 0:
        cnt += 1
        dfs(i)

print(cnt)