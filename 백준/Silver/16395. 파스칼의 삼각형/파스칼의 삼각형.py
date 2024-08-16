import sys

input = sys.stdin.readline

n, k = map(int, input().strip().split())
pascal = [[0] * 30 for _ in range(30)]

for i in range(30):
    pascal[i][0], pascal[i][i] = 1, 1

for i in range(2, 29):
    for j in range(1, i):
        pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]

result = pascal[n-1][k-1]

sys.stdout.write(str(result) + '\n')