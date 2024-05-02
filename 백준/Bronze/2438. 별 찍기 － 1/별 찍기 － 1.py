N = int(input())

for i in range(1, N+1):
    str = ""
    for j in range(i):
        str += "*"
    print(str)