N, M = map(int, input().split())
realCount = 0
NewCount = [[0] * (M - 7) for _ in range(N - 7)]
Board = list()
for _ in range(N):
    Board.append(input())

for k in range(N - 7):
    for l in range(M - 7):
        OddCount = 0
        EvenCount = 0
        for i in range(k, k + 8):
            if i % 2 == 0:
                for j in range(l, l + 8):
                    if j % 2 == 0:
                        if Board[i][j] != "W":
                            OddCount += 1
                    else:
                        if Board[i][j] != "B":
                            OddCount += 1
            else:
                for j in range(l, l + 8):
                    if j % 2 == 0:
                        if Board[i][j] != "B":
                            OddCount += 1
                    else:
                        if Board[i][j] != "W":
                            OddCount += 1
        for i in range(k, k + 8):
            if i % 2 == 0:
                for j in range(l, l + 8):
                    if j % 2 == 0:
                        if Board[i][j] != "B":
                            EvenCount += 1
                    else:
                        if Board[i][j] != "W":
                            EvenCount += 1
            else:
                for j in range(l, l + 8):
                    if j % 2 == 0:
                        if Board[i][j] != "W":
                            EvenCount += 1
                    else:
                        if Board[i][j] != "B":
                            EvenCount += 1
        NewCount[k][l] = min(OddCount, EvenCount)

min_value = min(min(row) for row in NewCount)
print(min_value)
