# 9012. 괄호 - 오늘 나를 지겹게 한 ^^
stack = []
def gal(text):
    for ch in text:
        if ch == '(':
            stack.append(ch)
        elif ch == ')':
            if len(stack) == 0:
                return 'NO'
            else:
                if stack[-1] == '(':
                    stack.pop()
                    continue
                else:
                    return 'NO'

    if len(stack) == 0:
        return 'YES'
    else:
        return 'NO'

import sys
T = int(sys.stdin.readline())
for _ in range(T):
    bracket = sys.stdin.readline()
    stack = []

    result = gal(bracket)
    print(result)
