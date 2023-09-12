# 1012. 유기농 배추
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline
def dfs(a, b):
    global cnt

    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]

    for s in range(4):
        di = a + dx[s]
        dj = b + dy[s]
        if 0 <= di < M and 0 <= dj < N:
            if organic[di][dj] == 1:
                organic[di][dj] = 0
                dfs(di, dj)

    return 1

T = int(input())
for _ in range(T):
    M, N, K = map(int, input().split())
    organic = [[0 for _ in range(N)] for _ in range(M)]
    cnt = 0

    for _ in range(K):
        X, Y = map(int, input().split())
        organic[X][Y] = 1

    for i in range(M):
        for j in range(N):
            if organic[i][j] == 1:
                cnt += dfs(i, j)

    print(cnt)
