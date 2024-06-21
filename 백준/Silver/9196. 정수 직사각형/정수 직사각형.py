def findRect(h, w):
    curDiagonal = h**2 + w**2
    minDiagonal = 151**2 * 2
    resultH = 0
    resultW = 0

    for nh in range(1, 151):
        for nw in range(nh + 1, 151):
            newDiagonal = nh**2 + nw**2
            if (newDiagonal > curDiagonal) or (newDiagonal == curDiagonal and nh > h):
                if (newDiagonal < minDiagonal) or (newDiagonal == minDiagonal and nh < resultH):
                    minDiagonal = newDiagonal
                    resultH = nh
                    resultW = nw
                
    return resultH, resultW

while True:
    h, w = map(int, input().split())
    if h == 0 and w == 0:
        break
    print(*findRect(h, w))