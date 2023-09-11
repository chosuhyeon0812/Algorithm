# 2493. 탑
N = int(input())
top = list(map(int, input().split()))
# 인덱스와 탑
susin = []
# 수신할 탑의 인덱스
idx = []
for i in range(N):
    while susin:
        # 수신이 가능한 상황이면...
        if susin[-1][1] > top[i]:
            idx.append(susin[-1][0]+1)
            break
        # 제거하면서 더 높은 탑 꼭대기가 나올때까지 팝해준다...
        else:
            susin.pop()
    # 수신이 불가능한 상황이라면...
    if not susin:
        idx.append(0)
    susin.append([i, top[i]])
result = ' '.join(map(str, idx))
print(result)

