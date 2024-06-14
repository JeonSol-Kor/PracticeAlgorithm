num = int(input())
deciNum = 0
deci = [0] * 9
while num > 0:
    deciNum = num % 10
    if deciNum == 9:
        deciNum = 6
    deci[deciNum] += 1
    num //= 10

deci[6] = deci[6] // 2 if deci[6] % 2 == 0 else deci[6] // 2 + 1

max = 0
for check in deci:
    if max < check:
        max = check

print(max)