# 25501. 재귀의 귀재
def recursion(s, l, r):
    global cnt
    cnt += 1
    if l >= r: return 1
    elif s[l] != s[r]: return 0
    else:
        return recursion(s, l+1, r-1)
def isPalindrome(s):
    return recursion(s, 0, len(s)-1)

T = int(input())
for _ in range(T):
    word = input()
    cnt = 0 # 초기화 자리 중요
    print(isPalindrome(word), cnt)
