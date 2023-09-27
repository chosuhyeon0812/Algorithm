N, K = map(int, input().split())
result = 1
nums = [i for i in range(N, 0, -1)]
# print(nums)

for i in range(K):
    result *= nums[i]
    result //= (i+1)

print(result)