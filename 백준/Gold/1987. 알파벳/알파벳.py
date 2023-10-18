# 1987. 알파벳
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def dfs(x, y, cnt):
    global distance
    distance = max(distance, cnt)
    alphabet.add(graph[x][y])
    
    for i in range(4):
        di = x + dx[i]
        dj = y + dy[i]
        if 0 <= di < R and 0 <= dj < C:
            if graph[di][dj] not in alphabet:
                dfs(di, dj, cnt+1)
                alphabet.remove(graph[di][dj])



R, C = map(int, input().split())
graph = [list(input()) for _ in range(R)]
alphabet = set()

# dict = {'A' : 0, 'B' : 1, 'C' : 2, 'D' : 3, 'E' : 4, 'F' : 5,
#         'G' : 6, 'H' : 7, 'I' : 8, 'J' : 9, 'K' : 10, 'L' : 11,
#         'M' : 12, 'N' : 13, 'O' : 14, 'P' : 15, 'Q' : 16, 'R' : 17,
#         'S' : 18, 'T' : 19, 'U' : 20, 'V' : 21, 'W' : 22, 'X' : 23,
#         'Y' : 24, 'Z' : 25}

# visited = [False] * 26
distance = 0
dfs(0, 0, 1)
print(distance)
# print(visited)
# print(graph)