import sys

N = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))
v = int(sys.stdin.readline())
count = 0
for number in numbers:
    if(number == v):
        count += 1

print(count)