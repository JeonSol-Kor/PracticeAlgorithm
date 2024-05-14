max = 0
maxR = 1
maxC = 1
matrix = [list(map(int, input().split())) for _ in range(9)]

for i in range(9):
    for j in range(9):
        if matrix[i][j] > max:
            max = matrix[i][j]
            maxR = i + 1
            maxC = j + 1

print(max)
print(maxR, maxC)