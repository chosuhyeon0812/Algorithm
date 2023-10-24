# 1644. 소수의 연속합

import math
import sys
input = sys.stdin.readline

N = int(input())
prime = []
arr = [True for _ in range(N+1)]
arr[0] = arr[1] = False
for i in range(2, N+1):
    if arr[i]:
        prime.append(i)
        # i의 2배 이상 부터는 다 false...
        for j in range(2*i, N+1, i):
            arr[j] = False

result = start = end = 0
while end <= len(prime):
    each = sum(prime[start:end])
    if each == N:
        result += 1
        end += 1
    elif each < N:
        end += 1
    else:
        start += 1
print(result)
