import math

def isPrime(number):
    if number == 1:
        return False
    for i in range(2, int(math.sqrt(number))+1):
        if number % i == 0:
            return False
    return True

M, N = map(int, input().split())
for i in range(M, N + 1):
    if isPrime(i):
        print(i)