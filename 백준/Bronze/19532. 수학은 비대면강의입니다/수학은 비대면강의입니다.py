# 19532. 수학은 비대면 강의입니다
# 연립방정식의 x, y 값을 구하라
a, b, c, d, e, f = map(int, input().split())
x = -999
y = -999
answer = []
for x in range(-999, 1000):
    for y in range(-999, 1000):
        if a * x + b * y == c and d * x + e * y == f:
            answer.append(x)
            answer.append(y)

result = ' '.join(map(str, answer))
print(result)



