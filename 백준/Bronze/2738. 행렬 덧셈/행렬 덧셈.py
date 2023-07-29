# N, M 크기의 두 행렬 A, B가 주어졌을 떄 두 행렬을 더하라
# A의 첫 숫자와 B의 같은 위치에 있는 숫자를 더해서 결과를 가져옴

N, M = map(int, input().split())
# print(N, M)

arr1=[]
arr2=[]
result = []
for i in range(N):
    arr1.append(list(map(int,input().split()))) #[1, 1, 1]

for j in range(N, 2 * N):
    arr2.append(list(map(int,input().split())))
# print(arr1)
# print(result)

for i in range(N):
    for j in range(M):
        print(arr1[i][j] + arr2[i][j], end = " ")
    print()
