# 2103. 직교다각형 복원
import sys
input = sys.stdin.readline
data_x = {}
data_y = {}
N = int(input())
for _ in range(N):
    x, y = map(int, input().split())
    data_x.setdefault(x, []).append(y)
    data_y.setdefault(y, []).append(x)

# print(data_x)
# print(data_y)
sum = 0
for d_x in data_x.values():
    d_x.sort()
    for j in range(len(d_x)-1, 0, -2):
        sum += d_x[j] - d_x[j-1]

for d_y in data_y.values():
    d_y.sort()
    for k in range(len(d_y)-1, 0, -2):
        sum += d_y[k] - d_y[k-1]

print(sum)