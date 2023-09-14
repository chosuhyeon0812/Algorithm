# 11047. 동전 0
N, K = map(int, input().split())
coins = []
for _ in range(N):
    coins.append(int(input()))
coins.sort(reverse=True)

cnt = 0
for i in coins:
    cnt += K//i
    K %= i

print(cnt)