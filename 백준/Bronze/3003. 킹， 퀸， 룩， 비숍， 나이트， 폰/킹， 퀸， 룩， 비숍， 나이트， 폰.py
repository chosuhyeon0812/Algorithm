# 체스판과 피스 발견, 총 16개의 피스
# 피스는 킹1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
# 검은색은 다 있고 흰색이 이상함
# 몇개를 더하거나 빼야 올바른 세트가 되는지
white = [1, 1, 2, 2, 2, 8]
white_list = list(map(int, input().split()))
# print(white_list)
result = []
for i in range(len(white)):
    result.append(white[i] - white_list[i])
# print(result)
for i in result:
    print(i, end = " ")
