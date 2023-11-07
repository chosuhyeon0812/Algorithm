# 2247. 실질적 약수
def measure(n):
    total = 0
    for i in range(2, n//2+1):
        q = n // i
        total += i * (q - 1)
    return total % 1000000

n = int(input())
print(measure(n))