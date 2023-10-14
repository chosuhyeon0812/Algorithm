L = int(input())
N = int(input())
mx1 = mx2 = mx1_idx = mx2_idx = 0
lst = [1] * (L+1)
for i in range(1, N+1): # 방청객 번호 순으로 반복
    s, e = map(int, input().split())
    if mx1 < e - s + 1: # 원한 개수가 가장 큰 값이면갱신
        mx1, mx1_idx = e - s + 1, i

    cnt = sum(lst[s:e+1]) # 실제 i번 방청객이 받은 롤케이크 순
    if mx2 < cnt:
        mx2, mx2_idx = cnt, i
    lst[s:e+1] = [0] *(e-s+1) # 가져간만큼 개수를 0으로 처리

print(mx1_idx)
print(mx2_idx)
