# 18870. 좌표 압축
N = int(input())
num = list(map(int, input().split()))
num2 = sorted(set(num))
# print(num)
# print(num2)
dic = {num2[i] : i for i in range(len(num2))}
# print(dic)
for i in num:
    print(dic[i], end = ' ')