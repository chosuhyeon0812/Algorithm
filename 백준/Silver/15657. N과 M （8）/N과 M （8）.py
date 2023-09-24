# 15657. N과 M(8)
def backtracking(L, end):
    if L == M:
        print(*result)
        return

    for i in range(end, N):
        result[L] = nums[i]
        backtracking(L+1, i)

N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
result = [0] * M
backtracking(0, 0)