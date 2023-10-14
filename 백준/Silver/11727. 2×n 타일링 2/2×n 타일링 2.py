# 11727. 2xn 타일링 2

'''
우측이 추가하는 방식으로 풀어나가야 한다...

=> n = 3
n = 1 우측에 (1*2) 2개, (2 *2) 1개 추가하는것과
n = 2 우측에 (2 * 1) 1개 추가하는 것  더해줌!!
n[1] = 1
n[2] = 3
n[3] = n[2] * 1 + n[1] * 2 = 5
n[4] = n[3] * 1 + n[2] * 2 = 11
dp[i] : 2 * i 길이 직사각형 만드는 방법 수

for i in range(3, N+1):
    dp[i] = dp[i-1] + dp[i-2] * 2
'''

import sys
input = sys.stdin.readline

N = int(input())

# dp[] table 정의
# dp[i] = 2 * i의 길이의 직사각령을 만드는 방법의 수
dp = [0] * (N+1)

# dp[]의 초기값 설정
# n==1인 경우 dp[2]를 설정하면 index 오류가 나므로 아래처럼 실행
# dp[i], dp[2] = 1, 3
dp[0] = 1
dp[1] = 1

# 범위 정해서 반복 처리
for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2] * 2

ans = dp[N]

print(ans % 10007)

