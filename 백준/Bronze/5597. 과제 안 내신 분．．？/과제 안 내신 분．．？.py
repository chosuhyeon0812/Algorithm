list1 = []
for i in range(1, 31):
    list1.append(i)

list2 = []
for x in range(1,29):
    x = int(input())
    list2.append(x)

new_list = [x for x in list1 if x not in list2]

for i in sorted(new_list):
    print(i)