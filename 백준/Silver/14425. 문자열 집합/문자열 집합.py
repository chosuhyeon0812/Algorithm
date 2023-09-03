# 14425. 문자열 집합
N, M = map(int, input().split())
check = []
for _ in range(N):
    S = input()
    check.append(S)
# check = ''.join(check)
# print(check)
cnt = 0
for _ in range(M):
    c = input()
    if c in check:
        cnt += 1
print(cnt)