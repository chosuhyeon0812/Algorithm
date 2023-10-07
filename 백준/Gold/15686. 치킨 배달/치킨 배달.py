N, M = map(int, input().split())
answer = float('inf')
house = []
chicken = []
mapping = [list(map(int, input().split())) for _ in range(N)]
for i in range(N):
    for j in range(N):
        if mapping[i][j] == 1:
            house.append((i, j))
        elif mapping[i][j] == 2:
            chicken.append((i, j))

def dfs(idx, arr):
    global answer

    if len(arr) == M:
        total_distance = 0

        for r, c in house:
            distance = float('inf')
            for r_, c_ in arr:
                distance = min(distance, abs(r-r_) + abs(c-c_))
            total_distance += distance
        answer = min(answer, total_distance)
        return

    if idx == len(chicken):
        return

    dfs(idx+1, arr+[chicken[idx]])
    dfs(idx+1, arr)

checked = [False] * (len(chicken) +1)
dfs(0, [])
print(answer)