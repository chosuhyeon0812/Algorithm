# 10814. 나이순 정렬
import sys
input = sys.stdin.readline
N = int(input())
people = []
for _ in range(N):
    age, name = list(input().split())
    age = int(age)
    people.append((age, name))
people.sort(key = lambda x : x[0])
for i in people:
    print(*i)