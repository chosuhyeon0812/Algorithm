N, S = map(int, input().split())
arr = list(map(int, input().split())) + [0 for _ in range(10001)]

start = 0
end = 0
sum_num = arr[0]
length = 1

result = 999999

if sum(arr) < S:
    print(0)

else:
    while end < N:
        if sum_num < S:
            end += 1
            length += 1
            sum_num += arr[end]
        else:
            result = min(result, length)
            start += 1
            sum_num -= arr[start-1]
            length -= 1

    print(result)