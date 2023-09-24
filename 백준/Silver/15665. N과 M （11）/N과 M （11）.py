# 15665. N과 M (11)
def backtracking(depth):
    if depth == M:
        print(*result)
        return
    for i in range(N):
        if visited[i]:
            continue
        if result[depth] == nums[i]:
            continue
        result[depth] = nums[i]
        backtracking(depth+1)

N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
result = [0] * M
visited = [0] * N
backtracking(0)