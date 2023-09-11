import sys
input = sys.stdin.readline
n = int(input())
stack = []
result = []
flag = 0
now = 1
for i in range(n):
    num = int(input())
    while now <= num:
        stack.append(now)
        result.append("+")
        now += 1
    if stack[-1] == num:
        stack.pop()
        result.append("-")
    else:
        print("NO")
        flag = 1
        break
if flag == 0:
    for i in result:
        print(i)