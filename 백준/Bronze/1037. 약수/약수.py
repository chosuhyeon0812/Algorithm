# 1037. 약수
import sys
input = sys.stdin.readline
N = int(input())
num = list(map(int, input().split()))

result = 0
num.sort()
if len(num) == 1:
    a = num.pop()
    result = a ** 2
else:
    result = num[0] * num[-1]

print(result)