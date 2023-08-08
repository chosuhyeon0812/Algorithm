N = int(input())
cnt = 0 # 세는 횟수
i = 0
N1 = 666
N2 = 1666
N3 = 2666
while True:
    if str(N1) in str(i):
        cnt += 1
        if cnt == N: # 세는 횟수가 입력횟수랑 같아지면 그만 세어야지
            break
    i += 1 # 666이 될때까지 계속해서 i의 값을 더해줌
print(i)