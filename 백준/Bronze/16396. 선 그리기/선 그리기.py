import sys

input = sys.stdin.readline

result = 0
check = list(False for _ in range(10000))

N = int(input().strip())
for _ in range(N):
    X, Y = map(int, input().strip().split())
    for i in range(X, Y):
        check[i] = True

for ch in check:
    if ch:
        result += 1

sys.stdout.write(str(result) + '\n')