# 2747. 피보나치 수(DP 필수 문제 #01)
'''
1. 시각적으로 접근..
2. dp[] table 정의, dp[i]
3. 초기값 설정, 반복 처리
'''

# 내 풀이!

# N = int(input())
#
# dp = [0] * (N+1)
# dp[1] = 1
# for i in range(2, N+1):
#     dp[i] = dp[i-1] + dp[i-2]
# print(dp[N])

### 문어 박사님 풀이 ###

N = int(input())
dp = [0] * (N+1)
dp[1] = 1
for i in range(2, N+1):
    dp[i] = dp[i-2] + dp[i-1]
ans = dp[N]
print(ans)
