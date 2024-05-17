import sys

N = int(sys.stdin.readline().rstrip())

paper = [[0 for _ in range(100)] for _ in range(100)]

for _ in range(N):
    x, y = map(int, sys.stdin.readline().strip().split())
    for i in range(x, x + 10):
        for j in range(y, y + 10):
            paper[i][j] = 1

area = sum(sum(row) for row in paper)

sys.stdout.write(str(area) + '\n')