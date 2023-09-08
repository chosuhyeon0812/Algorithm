# 18110. solved.ac
import sys
input = sys.stdin.readline

def round(num):
    return int(num) + (1 if num - int(num) >= 0.5 else 0)

N = int(input())
if not N:
    print(0)
else:
    score = [int(input()) for _ in range(N)]
    trunc = round(N * 0.15)
    apply_trunc = sorted(score)[trunc: N-trunc]
    average = round(((sum(apply_trunc)) / len(apply_trunc)))
    print(average)
