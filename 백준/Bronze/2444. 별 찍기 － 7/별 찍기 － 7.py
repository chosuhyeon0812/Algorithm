# 첫째줄 부터 2 * N -1 번째 줄까지 출력
# N까지는 2개씩 많아지고
# 그 이후로는 2개씩 줄어든다..

N = int(input())
for i in range(1,N+1):
    print(' '*(N-i)+'*'*(2*i-1))
for i in range(N-1,0,-1):
    print(' '*(N-i)+'*'*(2*i-1))