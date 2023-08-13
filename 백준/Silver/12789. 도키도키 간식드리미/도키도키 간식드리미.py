# 12789. 도키도키 간식드리미
# 숭환이가 무사히 간식을 받을 수 있으면 "Nice" 없으면 "Sad"래

N = int(input())
num = list(map(int, input().split()))
stack = [] # 웨이팅 존
order = 1 # 간식 받을 순서

# 입력 받은 동안
while num:
    if num[0] == order:
        num.pop(0)
        order += 1
    else:
        stack.append(num.pop(0))
    # 웨이팅 존에 값에 안 맞는거 다 차겠지?

    while stack:
        if stack[-1] == order:
            stack.pop()
            order += 1
        else: # 안맞으면 바로 못받지
            break

# 실행이 다 끝났을 떄 스택에 안무것도 안 남아있으면 nice~~
if stack:
    print('Sad')
else:
    print('Nice')