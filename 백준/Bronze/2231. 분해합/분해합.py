N = int(input())
M = 0

for i in range(1, N):
    check = i
    test = i
    while check > 0:
        test += check % 10
        check //= 10
    if test == N:
        M = i
        break

print(M)