point = [list(map(int, input().split())) for _ in range(3)]

X = point[0][0]
Y = point[0][1]

if X == point[1][0]:
    X = point[2][0]
elif X == point[2][0]:
    X = point[1][0]
    
if Y == point[1][1]:
    Y = point[2][1]
elif Y == point[2][1]:
    Y = point[1][1]
    
print(X, Y)