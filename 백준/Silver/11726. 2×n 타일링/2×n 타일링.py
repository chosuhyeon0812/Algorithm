# 11726. 타일링

'''
1. 아이디어
- 점화식 : An = An-1 + An-2
- N 값 구하기 위해, for 문 3부터 N까지의 값 구해주기
- 이전값, 이전이전값 더해서 , 10007로 나눠 저장

2. 시간 복잡도
- O(n)

3. 자료 구조
- DP값 저장하는 (경우의 수) 배열 : int []
- 최댓값 : 10007보다 작음 > INT
'''

import sys
input = sys.stdin.readline
n = int(input())
result = [0, 1, 2]

for i in range(3, n+1):
    result.append((result[i-1] + result[i-2])%10007)

print(result[n])