# 2230. 수 고르기
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nums = []
for _ in range(N):
    nums.append(int(input()))
nums.sort()
mx = nums[-1] - nums[0]
start = 0
end = 0
while start < N-1:
    gap = nums[end] - nums[start]
    if gap >= M:
        if mx > gap:
            mx = gap
        start += 1
    else:
        if N-1 > end:
            end += 1
        else:
            start += 1
print(mx)