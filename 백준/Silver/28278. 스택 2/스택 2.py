# 28278. 스택 2
# 입력으로 주어지는 명력을 처리하는 프로그램
# 1x : 정수 x를 스택에 넣는다
# 2 : 스택에 정수가 있다면 맨 위의 정수를 뺴고 출력, 없으면 -1
# 3 : 스택에 들어있는 정수의 개수를 출력
# 4 : 스택이 비어있으면 1, 아니면 0
# 5 : 스택에 정수가 있다면 맨 위의 정수를 뺴고 출력, 없으면 -1
import sys
# 명령의 수 : N
stack = []
N = int(sys.stdin.readline())

for _ in range(N):
    result = sys.stdin.readline().split()

    if result[0] == '1':
        stack.append(result[-1])

    if result[0] == '2':
        if len(stack) != 0:
            print(stack.pop())
        else:
            print(-1)

    if result[0] == '3':
        print(len(stack))

    if result[0] == '4':
        if len(stack) == 0: # 스택이 비어있으면
            print(1)
        else: # 스택에 자료가 차 있으면
            print(0)

    if result[0] == '5':
        if len(stack) != 0:
            print(stack[-1])
        else:
            print(-1)


