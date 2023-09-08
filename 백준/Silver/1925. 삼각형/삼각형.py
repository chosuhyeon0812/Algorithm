#1925. 삼각형
x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())
x3, y3 = map(int, input().split())

a1 = (abs(x2-x1)**2 + abs(y2-y1)**2)
a2 = (abs(x3-x2)**2 + abs(y3-y2)**2)
a3 = (abs(x3-x1)**2 + abs(y3-y1)**2)

a = [a1, a2, a3]
b = [a1**0.5, a2**0.5, a3**0.5]

a.sort()
b.sort()

tri = ''
if b[2] >= b[1] + b[0]:
    tri = 'X'
else:
    if b[0] == b[1] and b[1] == b[2]:
        tri = 'JungTriangle'
    elif b[0] == b[1] or b[1] == b[2] or b[0] == b[2]:
        if a[0] + a[1] < a[2]:
            tri = 'Dunkak2Triangle'
        elif a[0] + a[1] == a[2]:
            tri = 'Jikkak2Triangle'
        else:
            tri = 'Yeahkak2Triangle'
    else:
        if a[0] + a[1] < a[2]:
            tri = 'DunkakTriangle'
        elif a[0] + a[1] == a[2]:
            tri = 'JikkakTriangle'
        else:
            tri = 'YeahkakTriangle'

print(tri)
