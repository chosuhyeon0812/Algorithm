def fun(depth):
    global cnt

    if depth == N:
        total = [arr[i] for i in range(N) if visited[i] == True]
        if len(total) >0  and sum(total) == S:
            cnt += 1
        return

    visited[depth] = False
    fun(depth+1)

    visited[depth] = True
    fun(depth+1)

N, S = map(int, input().split())
arr = list(map(int, input().split()))
visited = [False] * N
cnt = 0
fun(0)
print(cnt)
