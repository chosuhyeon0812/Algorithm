# 6198. 옥상 정원 꾸미기
import sys
input = sys.stdin.readline

N = int(input())
stack = []
cnt = 0

h = []
for _ in range(N):
    h.append(int(input()))

for i in h:
    # while stack and stack[-1] > i:
    while stack and stack[-1] <= i:
        stack.pop()
    stack.append(i)
    cnt += len(stack)-1

print(cnt)