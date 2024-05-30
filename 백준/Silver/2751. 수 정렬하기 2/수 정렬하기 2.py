import sys

N = int(sys.stdin.readline())

count = [0] * 20000001

for _ in range(N):
    num = int(sys.stdin.readline().strip())
    count[num+1000000] += 1

for i in range(20000001):
    if count[i] > 0:
        sys.stdout.write(f"{i-1000000}\n")