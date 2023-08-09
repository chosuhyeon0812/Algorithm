# 1018. 체스판 다시 칠하기
N, M = map(int, input().split())
arr = [list(input()) for _ in range(N)]
# 도달할 수 있는 범위
# 행
new_range = N - 7
# 열
new_range_2 = M - 7
board = []
for i in range(new_range):
    for j in range(new_range_2):
        f_w = 0 # w로 시작할때 바꿔야 할 수
        f_b = 0 # b로 시작할 때 바꿔야 할 수
        for c_i in range(i, i + 8): # 체스판은 8*8 크기이므로 8크기로 잘라내야 함...
            for c_j in range(j, j + 8):
                if (c_i + c_j) % 2 == 0: # 체스판의 i, j의 좌표의 합이 짝수일 떼
                    #print(c_i, c_j) #아웃오브레인지가 나온다면 거기에 있는 값이 뭔지 확인하기
                    if arr[c_i][c_j] != 'W': # W가 안 칠해져 있으면 + 1
                        f_w += 1
                    if arr[c_i][c_j] != 'B': # B가 안 칠해져 있으면 + 1
                        f_b += 1

                else: # 체스판의 i, j의 좌표의 합이 홀수일 때
                    if arr[c_i][c_j] != 'B': # W가 안 칠해져 있으면 + 1
                        f_w += 1
                    if arr[c_i][c_j] != 'W': # B가 안 칠해져 있으면 + 1
                        f_b += 1

        board.append(f_b)
        board.append(f_w)

print(min(board))









