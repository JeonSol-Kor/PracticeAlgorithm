import sys

input = sys.stdin.readline

N, M = map(int, input().strip().split())
grid = [input().strip() for _ in range(N)]

side = 1

for i in range(N):
    for j in range(M):
        for size in range(1, min(N - i, M - j)):
            if grid[i][j] == grid[i][j + size] == grid[i + size][j] == grid[i + size][j + size]:
                side = max(side, size + 1)

print(side * side)