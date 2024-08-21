import sys

input = sys.stdin.readline

N = int(input().strip())
result = 0

for _ in range(N):
    A, B = map(int, input().strip().split())
    if A == 136:
        result += 1000
    elif A == 142:
        result += 5000
    elif A == 148:
        result += 10000
    elif A == 154:
        result += 50000

sys.stdout.write(str(result) + '\n')