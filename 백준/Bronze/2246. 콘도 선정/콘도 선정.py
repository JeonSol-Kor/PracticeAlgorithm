import sys

input = sys.stdin.readline

N = int(input().strip())
condos = []

for i in range(N):
    D, C = map(int, input().strip().split())
    condos.append([D, C])

condos.sort()
cost = 10001
result = 0

for i in condos:
    temp = i[1]
    if temp < cost:
        cost = temp
        result += 1

sys.stdout.write(f"{result}\n")