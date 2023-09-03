# 1620. 나는야 포켓몬 마스터 이다솜
import sys
input = sys.stdin.readline
N, M = map(int, input().split())
result = set()
for _ in range(N):
    hear = input().strip()
    result.add(hear)
result2 = set()
for _ in range(M):
    look = input().strip()
    result2.add(look)

ans = sorted(list(result & result2))
print(len(ans))
print(*ans, sep = '\n')
