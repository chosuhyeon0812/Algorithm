# 2606. 바이러스
def dfs(start):
    global virus, visited
    visited[start] = 1
    for i in virus[start]:
        if visited[i] == 0:
            dfs(i)

import sys
input = sys.stdin.readline
N = int(input())
M = int(input())
virus = [[] for _ in range(N+1)]
visited = [0] * (N+1)
for _ in range(M):
    s, e = map(int, input().split())
    # 이 부분 중요~~
    virus[e] += [s]
    virus[s] += [e]
dfs(1)
# print(virus)
print(sum(visited)-1)
