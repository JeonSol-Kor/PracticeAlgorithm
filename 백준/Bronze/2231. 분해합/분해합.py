strN = input()
N = int(strN)
min = N - len(strN) * 9
if min < 1:
    min = 1
M = 0

for i in range(min, N):
    check = i
    test = i
    while check > 0:
        test += check % 10
        check //= 10
    if test == N:
        M = i
        break

print(M)