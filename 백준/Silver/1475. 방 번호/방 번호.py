#1475. 방번호
result = [0] * 10
room = input()
for i in range(len(room)):
    num = int(room[i])
    if num == 6 or num == 9:
        if result[6] <= result[9]:
            result[6] += 1
        else:
            result[9] += 1
    else:
        result[num] +=1

print(max(result))

