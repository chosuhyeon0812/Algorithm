# 10773. 제로
# 0을 외치면 가장 최근에 적은 수 지우기
# 정수 K : 테스트 개수
import sys
stack = []
K = int(sys.stdin.readline())
for i in range(K):
    result = int(sys.stdin.readline())
    if result != 0:
        stack.append(result)
    elif result == 0:
        stack.pop() # stack.pop(-1)와 같음

sum = 0
for i in stack:
    sum += i

print(sum)


