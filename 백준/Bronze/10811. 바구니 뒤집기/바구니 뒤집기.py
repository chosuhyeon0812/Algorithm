# 가장 오른쪽 바구니를 N 번쨰 바구니 
N, M = map(int, input().split())
# 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다
# 순서를 역순으로 만들 범위를 정하고, 
# 그 범위에 들어있는 바구니의 순서를 역순으로 만든다
# 21345
# 21435
# 34125
# 34125

box = []
new_box = []
for x in range(1,N+1):
    box.append(x)
# new_box = box.reverse()
# print(new_box)
for y in range(M):
    i, j = map(int, input().split())
    new_box = box[i-1:j][::-1]
    # print(new_box)

    for a in range(i-1, j):
        box[a] = new_box[a - (i - 1)]
        # print(box)

for z in box:
    print(z, end = ' ')

