# 1021. 회전하는 큐
from collections import deque
import sys
input = sys.stdin.readline
t = deque()
# N : 큐의 크기(1부터 N까지), M : 찾아야 하는 수의 개수
N, M = map(int, input().split())
# 찾아야 하는 수의 위치
num = list(map(int, input().split()))
# 데크에 큐 넣어주기
for i in range(1, N+1):
    t.append(i)

# 찾기 위해 필요한 횟수의 최솟값 더하기
cnt = 0
for i in num:
    while True:
        # 데크의 첫 위치와 찾아야 하는 값이 같으면
        if t[0] == i:
            t.popleft()
            break

        else:
            if t.index(i) < len(t)/2:
                while t[0] != i:
                    t.append(t.popleft())
                    cnt += 1
            else:
                while t[0] != i:
                    t.appendleft(t.pop())
                    cnt += 1

print(cnt)