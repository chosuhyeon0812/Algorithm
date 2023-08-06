arr = [[0] * 101 for _ in range(101)]
T = int(input())
for tc in range(T):
    a, b = map(int, input().split())

    for i in range(10):
        for j in range(10):
            arr[a+i][b+j] = 1

cnt = 0
for i in arr:
    cnt += sum(i)
print(cnt)


