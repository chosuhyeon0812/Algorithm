# 24060. 알고리즘 수업 - 병합 정렬 1
import sys
input = sys.stdin.readline

def merge_sort(A):
    # 저장되는 수
    # 크기가 1이라면 반환
    if len(A) == 1:
        return A

    # 리스트를 2분할
    mid = (len(A)+1)//2
    left = merge_sort(A[:mid])
    right = merge_sort(A[mid:])

    i = j = 0
    result = []

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            ans.append(left[i])
            i += 1
        else:
            result.append(right[j])
            ans.append(right[j])
            j += 1

    while i < len(left):
        result.append(left[i])
        ans.append(left[i])
        i += 1
    while j < len(right):
        result.append(right[j])
        ans.append(right[j])
        j += 1

    return result

N, K = map(int, input().split())
num = list(map(int, input().split()))
ans = []
merge_sort(num)
if len(ans) >= K:
    print(ans[K-1])# print(ans)

else:
    print(-1)
