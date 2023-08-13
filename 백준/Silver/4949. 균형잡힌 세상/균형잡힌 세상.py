# 4949. 균형잡힌 세상
while True:
    s = input()
# def world(s):
    stack = []
    if s == '.':
        break

    for i in s:
        if i == '(' or i == '[':
            stack.append(i)

        elif i == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(')')
                break

        elif i == ']':
            if len(stack) != 0 and stack[-1] == '[':
                stack.pop()
            else:
                stack.append(']')
                break

        elif i == '.':
            break

    if len(stack) == 0:
        print('yes')

    else:
        print('no')



