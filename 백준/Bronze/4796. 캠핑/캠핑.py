caseNum = 1

while True:
    case = 0
    L, P, V = map(int, input().split())
    if L == 0 and P == 0 and V == 0:
        break
    if V % P == 0:
        case = (V // P) * L 
    elif V % P > L:
        case = (V // P) * L + L
    else:
        case = (V // P) * L + V % P
    print(f"Case {caseNum}: {case}")
    caseNum += 1