# 9095. 1, 2, 3 더하기

def dp(num):
    if num == 1:
        return 1
    elif num == 2:
        return 2
    elif num == 3:
        return 4
    else:
        return dp(num-1) + dp(num-2) + dp(num-3)

T = int(input())
for i in range(T):
    key = int(input())

    cnt = dp(key)
    print(cnt)

