def solution(n):
    answer = [[0] * n for _ in range(n)]
    num = 1
    rowSt = 0
    colSt = 0
    rowEnd = n - 1
    colEnd = n - 1
    while num <= n**2:
        for i in range(colSt, colEnd + 1):
            answer[rowSt][i] = num
            num += 1
        rowSt += 1
        for i in range(rowSt, rowEnd + 1):
            answer[i][colEnd] = num
            num += 1
        colEnd -= 1
        for i in range(colEnd, colSt - 1, -1):
            answer[rowEnd][i] = num
            num += 1
        rowEnd -= 1
        for i in range(rowEnd, rowSt - 1, -1):
            answer[i][colSt] = num
            num += 1
        colSt += 1
    return answer