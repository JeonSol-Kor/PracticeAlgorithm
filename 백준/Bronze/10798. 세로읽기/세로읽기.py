import sys

matrix = [[' ']*15 for _ in range(5)]

for i in range(5):
    temp = sys.stdin.readline().rstrip()
    for j in range(len(temp)):
        matrix[i][j] = temp[j]

for i in range(15):
    for j in range(5):
        if matrix[j][i] != ' ':
            sys.stdout.write(matrix[j][i])