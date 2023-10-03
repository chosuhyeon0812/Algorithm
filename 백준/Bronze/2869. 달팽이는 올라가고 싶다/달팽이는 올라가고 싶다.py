# 달팽이는 올라가고 싶다
import sys
import math
input = sys.stdin.readline

A, B, V = map(int, input().split())
result = (V-B) / (A-B)
print(math.ceil(result))