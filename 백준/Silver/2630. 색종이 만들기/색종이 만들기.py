import sys

input = sys.stdin.readline

def checkColor(papers, row, col, n, white, blue):
    isPass = False
    if papers[row][col] == 0:
        for i in range(row, row + n):
            for j in range(col, col + n):
                if papers[i][j] != 0:
                    isPass = True
                    break
            else:
                continue
            break
        else:
            white += 1
    else:
        for i in range(row, row + n):
            for j in range(col, col + n):
                if papers[i][j] != 1:
                    isPass = True
                    break
            else:
                continue
            break
        else:
            blue += 1

    if isPass:
        half = n // 2
        papers1, row1, col1, n1, white1, blue1 = checkColor(
            papers, row, col, n // 2, white, blue
        )
        papers2, row2, col2, n2, white2, blue2 = checkColor(
            papers, row + half, col, n // 2, white, blue
        )
        papers3, row3, col3, n3, white3, blue3 = checkColor(
            papers, row, col + half, n // 2, white, blue
        )
        papers4, row4, col4, n4, white4, blue4 = checkColor(
            papers, row + half, col + half, n // 2, white, blue
        )
        white += white1 + white2 + white3 + white4
        blue += blue1 + blue2 + blue3 + blue4
    return papers, row, col, n, white, blue


N = int(input())
papers = list()
for _ in range(N):
    line = list(map(int, input().split()))
    papers.append(line)

papers, row, col, n, white, blue = checkColor(papers, 0, 0, N, 0, 0)
print(white)
print(blue)
