# 상수는 수를 거꾸로 읽는다
# 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다 
new_list = []
A, B = input().split()
new_list.append(A[::-1])
new_list.append(B[::-1])
# print(new_list)
if new_list[0] > new_list[1] :
    print(new_list[0])
else:
    print(new_list[1])