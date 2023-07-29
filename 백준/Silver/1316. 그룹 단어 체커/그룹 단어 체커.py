# aaabbbb처럼 연속된 문자만 그룹 단어의 개수로 출력하는 프로그램
N = int(input())
for i in range(N):
    word = input()

    for j in range(len(word)-1):
        if (word[j] == word[j+1]):
            pass
        elif (word[j] in word[j+1:]):
            N -= 1
            break
print(N)