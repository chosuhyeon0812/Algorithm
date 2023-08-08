# 분해 합
# 256(=245+2+4+5)

N = int(input())
result = 0
# 입력받은 숫자 동안에
for i in range(N):
    # 자신과 자신의 각각을 더해줬을떄,
    # 입력받은거랑 같으려면 어케 해야할까...
    sum = 0
    for j in str(i):
        sum += int(j)
    db = i + sum
    
    result = 0
    if db == N:
        result = i
        break
    else:
        result = 0

print(result)