N, M = map(int,input().split())
box = [0] * N
for i in range(M):
    A, B, C = map(int, input().split())
    for x in range(A, B+1):
        box[x-1] = C
for k in range(N):
    print(box[k], end = " ")