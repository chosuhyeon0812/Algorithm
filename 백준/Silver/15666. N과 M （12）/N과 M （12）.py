# 15666. N과 M(12)
def backtracking(L, beginwith):
    if L == M:
        if tuple(result) not in cnt:
            cnt.add(tuple(result))
            print(*result)
        return

    for i in range(beginwith, N):
        if visited[i]:
            continue

        result[L] = nums[i]
        backtracking(L+1, i)

N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

result = [0] * M
visited = [0] * N
cnt = set()
backtracking(0, 0)