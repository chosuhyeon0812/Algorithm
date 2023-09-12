from collections import deque

t = int(input())
for _ in range(t):
    p = input()
    n = int(input())
    x = input()[1:-1].split(',')

    t = deque(x)

    reverse = 0
    flag = False

    if n == 0:
        t = []

    for i in p:
        if i == 'R':
            reverse += 1
        else:
            if len(t) == 0:
                print('error')
                flag = True
                break
            elif reverse % 2 == 1:
                t.pop()
            else:
                t.popleft()

    if not flag:
        if reverse % 2 == 1:
            t.reverse()
        print('[' + ','.join(t) + ']')