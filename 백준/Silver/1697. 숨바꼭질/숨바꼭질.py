# 1697. 숨바꼭질
from collections import deque
def dfs(start, depth):
    visited = [0] * 100001
    q = deque()
    q.append((start, depth))
    visited[start] = 1
    while q:
        s, d = q.popleft()

        if s == K:
            return d

        for nxt_s in [s-1, s+1, s*2]:
            if 0 <= nxt_s <= 100000 and (not visited[nxt_s] or visited[nxt_s] > d+1):
                q.append((nxt_s, d+1))
                visited[nxt_s] = d+1

N, K = map(int, input().split())
visited = [0] * K
result = dfs(N, 0)
print(result)
