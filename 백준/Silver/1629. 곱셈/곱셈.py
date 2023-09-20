# 1629. 곱셈
'''
자연수 A를 B번 곱한 수
구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지
'''
def recursion(a, b):
    if b == 1:
        return a % C
    else:
        num = recursion(a, b//2)
        # 짝수인 경우
        if b % 2 == 0:
            return num * num % C
        # 홀수인 경우
        else:
            return num * num * a % C

import sys
input = sys.stdin.readline
A, B, C = map(int, input().split())
result = recursion(A, B)

print(result)