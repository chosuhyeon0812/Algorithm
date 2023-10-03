# 3568. iSharp

Declaration = input().replace(',', '')[:-1].split(' ')
# print(Declaration)

# 공통적인 부분
common = Declaration[0]

# 길이....(변수 +1)
num = len(Declaration)

for i in range(1, num):
    Declaration[i] = Declaration[i].replace('[]', '][')

for i in range(1, num):
    print(common, end="")
    word = Declaration[i]

    for j in range(len(word)-1, 0, -1):
        w = word[j]
        if not w.isalpha():
            print(w, end='')

    print('', end=' ')

    for j in range(0, len(word)):
        if word[j].isalpha():
            print(word[j], end='')

    print(';')