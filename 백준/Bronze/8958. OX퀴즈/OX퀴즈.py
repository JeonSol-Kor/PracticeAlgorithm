N = int(input())

for _ in range(N):
    OX = input()
    score = 0
    extra = 0
    for i in range(len(OX)):
        if OX[i] == "O":
            if i != 0:
                if OX[i - 1] == "O":
                    extra += 1
                    score += extra
            score += 1
        else:
            extra = 0
    print(score)