# 9372. 상근이의 여행
import sys
input = sys.stdin.readline

def dfs(node):
    global count
    visited[node] = 1
    for i in Tree[node]:
        if visited[i] == 0:
            count += 1
            dfs(i)

    return count

T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    Tree = [[] for _ in range(N+1)]

    for _ in range(M):
        a, b = map(int, input().split())
        Tree[a].append(b)
        Tree[b].append(a)

    visited = [0] * (N+1)
    count = 0
    print(dfs(1))