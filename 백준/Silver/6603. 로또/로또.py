# 6603. 로또
def backtracking(depth, beginwith):
    if depth == 6:
        print(*result)
        return

    for i in range(beginwith, k):
        if not visited[i]:
            result[depth] = nums[i]
            backtracking(depth+1, i+1)
            visited[i] = False


while True:
    lotto = list(map(int, input().split()))
    k = lotto[0]
    nums = lotto[1:]
    result = [0] * 6
    visited = [False] * k
    backtracking(0, 0)

    if k == 0:
        quit()
    print()

