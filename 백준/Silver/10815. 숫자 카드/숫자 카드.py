import sys

N = int(sys.stdin.readline().strip())
numsN = set(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline().strip())
numsM = list(map(int, sys.stdin.readline().split()))

result = []
for numM in numsM:
    if numM in numsN:
        result.append(1)
    else:
        result.append(0)

print(" ".join(map(str, result)))