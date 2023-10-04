'''
코딩 테스트 - 시뮬레이션
각 조건에 맞는 상황을 구현하는 문제..
1. 지도상에서 이동하면서 탐험?하는 문제
2. 배열 안에서 이동하면서 탐험?하는 문제
- 별도의 알고리즘 없이 풀 수 있으나 구현력 중요..

아이디어...
- 특정 조건을 만족하는 한 계속 이동 => while, 조건 만족하지 않으면 break
- 4방향 탐색 먼저 수행 => 빈칸 있을 경우 이동
- 4방향 탐색 안될 경우, 뒤로 한칸 가서 반복

시간복잡도
while 문 최대 : N * M => O(NM)
각 칸에서 4방향 연산 수행

자료구조
- map : int[][]
- 로봇청소기 위치, 방향, 전체 청소한 곳 수

0 : 청소x, 1 : 벽, 2 : 청소0

'''



N, M = map(int, input().split())
y, x, d = map(int, input().split())
map = [list(map(int, input().split())) for _ in range(N)]
cnt = 0
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

while True:
    if map[y][x] == 0:
        map[y][x] = 2
        cnt += 1
    sw = False
    for i in range(1, 5):
        ny = y + dy[d-i]
        nx = x + dx[d-i]
        if 0 <= ny < N and 0 <= nx < M:
            if map[ny][nx] == 0:
                # 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
                d = (d-i) % 4
                y = ny
                x = nx
                sw = True
                break

    # 4방향 모두 있지 않은 경우
    if sw == False:
        # 뒤쪽 방향이 막혀있는지 확인..
        ny = y - dy[d]
        nx = x - dx[d]
        if 0 <= ny < N and 0 <= nx < M:
            if map[ny][nx] == 1:
                break
            else:
                y = ny
                x = nx
        else:
            break
print(cnt)
