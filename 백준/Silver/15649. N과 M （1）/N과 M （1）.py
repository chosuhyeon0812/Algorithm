# # 15649. N과 M(1)
# def baektracking():
#     if len(num) == M:
#         print(' '.join(map(str, num)))
#         return
#
#     for i in range(1, N+1):
#         if i not in num:
#             num.append(i)
#             baektracking()
#             num.pop()
#
# N, M = list(map(int, input().split()))
# num = []
# baektracking()
#
#
def dfs(n, lst):
    # 종료조건 처리 + 정담 처리
    if n == M: # M개의 수열을 완성
        ans.append(lst)
        return

    # 하부 단계(함수 호출)
    for j in range(1, N+1):
        if v[j] == 0: #선택하지 않은 숫자인 경우 추가
            v[j] = 1
            dfs(n+1, lst+[j])
            v[j] = 0

N, M = map(int,input().split())
ans = []
v = [0] * (N+1)
dfs(0, [])
for lst in ans:
    print(*lst)