croatia_alphabet = ['c=', 'c-', 'dz=','d-', 'lj','nj', 's=', 'z=']
str = input()

for croatia in croatia_alphabet:
    if croatia in str:
        str = str.replace(croatia,"*")

print(len(str))