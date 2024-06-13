import sys

n, T = map(int, sys.stdin.readline().split())
line = list(map(int, sys.stdin.readline().split()))
sum = 0
count = 0
for time in line:
    sum += time
    if sum > T:
        break
    count += 1

print(count)