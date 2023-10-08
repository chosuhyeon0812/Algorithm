# 13164. 행복 유치원
N, K = map(int, input().split())
height = list(map(int, input().split()))
height.sort()

result = []
for i in range(N-1):
    result.append(height[i+1]-height[i])

result.sort()
cost = 0

for i in range(N-K):
    cost += result[i]
print(cost)