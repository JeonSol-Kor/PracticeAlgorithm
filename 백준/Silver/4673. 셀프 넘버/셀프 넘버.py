import sys

checkNum = [0] * 10001

for i in range(10001):
    sum = 0
    for j in str(i):
        sum += int(j)
    num = sum + i
    if num > 10000: continue
    checkNum[num] = 1

for i in range(1, 10001):
    if checkNum[i] == 0:
        sys.stdout.write(f"{i}\n")