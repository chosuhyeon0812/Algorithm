# 11659. 구간 합 구하기 4
'''
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지의 합을 구하는 프로그램
N : 수의 개수
M : 구해야하는 횟수
둘째줄 : N개의 수
'''
import sys
input = sys.stdin.readline
N, M = map(int, input().split())
num = list(map(int, input().split()))
result = [0]
total = 0
for i in range(N):
    total += num[i]
    result.append(total)

for _ in range(M):
    i, j = map(int, input().split())
    print(result[j] - result[i-1])

# for k in result:
#     print(k)
