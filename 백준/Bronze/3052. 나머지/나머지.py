N = []
for i in range(10):
    n = int(input())
    N.append(n)

remainder = []
for i in N:
    r = i % 42
    remainder.append(r)
    
# result = set(remainder)
print(len(set(remainder)))

