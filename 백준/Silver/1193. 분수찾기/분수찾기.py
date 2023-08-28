# 1193. 분수 찾기
N = int(input())
# 짝수라인은 분자가 1 늘어나고 분모가 1 감소
# 홀수라인은 분자가 1 줄어들고 분모가 1 증가

line = 0
idx = 0 # 마지막 인덱스 (1, 3, 6, 10...)
while idx < N:
    line += 1
    idx += line

result = []
# 라인 홀수일 떼
if line % 2:
    ja = idx - N + 1
    mo = line - idx + N
    result.append(ja)
    result.append('/')
    result.append(mo)
else:
    ja = line - idx + N
    mo = idx - N + 1
    result.append(ja)
    result.append('/')
    result.append(mo)
print(''.join(map(str,result)))