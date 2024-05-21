N = int(input())

if N == 1:
    X, Y = map(int, input().split())
    print(0)
else:
    minX = 10001
    minY = 10001
    maxX = -10001
    maxY = -10001
    for i in range(N):
        X, Y = map(int, input().split())
        if X < minX:
            minX = X
        if X > maxX:
            maxX = X
        if Y < minY:
            minY = Y
        if Y > maxY:
            maxY = Y
    print((maxX - minX) * (maxY - minY))