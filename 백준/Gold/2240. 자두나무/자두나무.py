# 2240. 자두 나무

T, W = map(int, input().split())
tree = [int(input()) for _ in range(T)]

dp = [[[0] * 3 for _ in range(W + 2)] for _ in range(T+1)]
if tree[0] == 1:
    dp[1][0][0] = 1
else:
    dp[1][1][1] = 1

for i in range(2, T+1):
    trees = tree[i-1]
    for j in range(W + 1):
        if trees == 1:
            dp[i][j][0] = max(dp[i - 1][j][0], dp[i - 1][j - 1][1]) + 1
            dp[i][j][1] = max(dp[i - 1][j - 1][0], dp[i - 1][j][1])
        else:
            dp[i][j][0] = max(dp[i - 1][j][0], dp[i - 1][j - 1][1])
            dp[i][j][1] = max(dp[i - 1][j - 1][0], dp[i - 1][j][1]) + 1

plum = -1
for w in range(W+1):
    plum = max(plum, max(dp[T][w][0], dp[T][w][1]))
print(plum)