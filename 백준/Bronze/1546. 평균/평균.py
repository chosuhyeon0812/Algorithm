# 세준이의 점수 중 최댓값 M
# 모든 점수를 => (자기 점수 / M) * 100으로 고참
# 과목의 개수 = N
N = int(input())
# 실제로 받은 점수
score = list(map(int, input().split()))

# 사기 친 점수 넣기
new = []
M = max(score)
for i in score:
    new.append((i / M * 100))

# 평균 구하기        
avg = sum(new) / N
print(avg)
