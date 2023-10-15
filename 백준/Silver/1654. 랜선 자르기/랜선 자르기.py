# 1654. 랜선 자르기
import sys
input = sys.stdin.readline

def binary_search(start, end):
    while start <= end:
        mid = (start + end) // 2 # 중간값 설정
        cnt = 0 # 랜선 수 카운팅
        for i in l:
            cnt += i // mid # 랜선을 자른 수

        if cnt >= N:
            start = mid + 1 # mid 값 줄여서 자른 랜선 수를 작게 만들어야 한다...
        else:
            end = mid - 1 # mid 값을 늘여서 자른 랜선 수를 크게 만들어야 한다
    return end

l = []
K, N = map(int, input().split())
for _ in range(K):
    l.append(int(input()))

l.sort()
s = 1
e = max(l)
print(binary_search(s, e))