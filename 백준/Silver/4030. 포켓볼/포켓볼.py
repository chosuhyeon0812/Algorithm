# 4030. 포켓볼
import sys
input = sys.stdin.readline

tc = 1
while True:
    start, end = map(int, input().split())
    # 멈추는 조건
    if start == end == 0:
        break

    # 가능한 경우
    cnt = 0
    # 변의 길이
    i = 0
    # 삼각형의 마지막 공이 첫 시작 점 보다 작으면 계속 더해줌
    # 1+2+3+... 이런 식으로 가니까 합공식을 사용해 줬다..
    while (i * (i+1)) // 2 < start:
        i += 1
    while (i * (i+1)) // 2 < end - 1:
        skak = (i*(i+1)) // 2 + 1
        if skak ** 0.5 == int(skak ** 0.5):
            cnt += 1
        i += 1
    print(f'Case {tc}: {cnt}')
    tc += 1

