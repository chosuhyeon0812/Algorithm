# 10798. 세로 읽기
# 세로로 읽어서 붙이기
word = [input() for _ in range(5)]
result = []
for j in range(15):
    for i in range(5):
        if j < len(word[i]):
            result.append(word[i][j])
print(''.join(result))