import sys

sum = 0
while True:
    num = int(sys.stdin.readline().strip())
    if num == -1:
        break
    sum += num

print(sum)