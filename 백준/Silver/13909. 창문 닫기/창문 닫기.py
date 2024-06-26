import sys, math

input = sys.stdin.readline

N = int(input().strip())

answer = 0
for i in range(1, int(math.sqrt(N)) + 1):
    answer = i
    if i * i >= N:
        break

print(answer)