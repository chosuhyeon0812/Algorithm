# 1759. 암호 만들기

def backtracking(length, beginwith):
    if length == L:
        ans = ''.join(result)
        sum = 0
        for i in ans:
            if i in capital:
                sum += 1
        if 1 <= sum <= L-2:
            print(ans)
        return

    for i in range(beginwith, C):
        result[length] = word[i]
        backtracking(length+1, i+1)


L, C = map(int, input().split())
word = list(input().split())
capital = 'aeiou'
word.sort()
# print(word)

result = [''] * L
visited = [False] * C
backtracking(0, 0)