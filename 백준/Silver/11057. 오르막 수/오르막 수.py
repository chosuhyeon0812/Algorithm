import sys

N = int(sys.stdin.readline())
# dp[] 2차원으로
dp = [[0] * 10 for _ in range(N+1)]
dp[1] = [1] * 10
for i in range(2, N+1):
    for j in range(10):
        dp[i][j] = sum(dp[i-1][j:])

ans = sum(dp[N])
print(ans % 10007)