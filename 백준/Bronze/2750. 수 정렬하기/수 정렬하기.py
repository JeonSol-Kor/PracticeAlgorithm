import sys

N = int(sys.stdin.readline().strip())
numbers = []

for _ in range(N):
    numbers.append(int(sys.stdin.readline()))

numbers.sort()

for i in range(N):
    sys.stdout.write(f"{numbers[i]}\n")