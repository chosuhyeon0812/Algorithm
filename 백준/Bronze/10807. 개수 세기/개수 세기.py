N = int(input())
L = map(int, input().split())
c = int(input())

count = 0

for i in L:
    if i == c:
        count += 1

print(count)
