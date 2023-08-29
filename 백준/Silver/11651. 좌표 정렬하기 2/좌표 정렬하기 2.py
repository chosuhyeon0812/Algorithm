# 11651. 좌표 정렬하기2
import sys
input = sys.stdin.readline
N = int(input())
result = []

# x값에 상관없이 y 값을 정렬 => y 값 정렬
for _ in range(N):
    x, y = map(int, input().split())
    result.append([y, x])

result.sort()
# print(result)

for y, x in result:
    print(x, y)
