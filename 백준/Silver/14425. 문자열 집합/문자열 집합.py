import sys

data = sys.stdin.read().split()

N = int(data[0])
M = int(data[0])

wordSet = set(data[2:N+2])

count = 0

for word in data[N+2:]:
    if word in wordSet:
        count += 1

print(count)