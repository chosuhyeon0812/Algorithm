# 10845. 큐
from collections import deque
import sys
input = sys.stdin.readline
q = deque()
N = int(input())
for _ in range(N):
    command = list(input().split())

    if command[0] == 'push':
        q.append(command[1])

    if command[0] == 'pop':
        if len(q) > 0:
            a = q.popleft()
            print(a)
        else:
            print(-1)

    if command[0] == "size":
        b = len(q)
        print(b)

    if command[0] == "empty":
        if len(q) == 0:
            print(1)
        else:
            print(0)

    if command[0] == "front":
        if len(q) > 0:
            print(q[0])
        else:
            print(-1)

    if command[0] == 'back':
        if len(q) > 0:
            print(q[-1])
        else:
            print(-1)