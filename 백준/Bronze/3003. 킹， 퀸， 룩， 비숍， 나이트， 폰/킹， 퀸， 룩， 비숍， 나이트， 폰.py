oldChess = [1, 1, 2, 2, 2, 8]

inputChess = list(map(int, (input().split())))
outputChess = list()
for i in range(len(oldChess)):
    outputChess.append("")
    outputChess[i] = oldChess[i] - inputChess[i]
    print(outputChess[i], end=" ")