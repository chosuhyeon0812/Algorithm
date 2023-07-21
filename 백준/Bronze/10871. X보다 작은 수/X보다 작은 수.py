# N : 수열 A의 개수, X : A보다 작은 정수
N, X = map(int, input().split())
# 수열 속 수
A = list(map(int, input().split()))


for i in range(N):
    if A[i] < X:
        print(A[i], end = " ")


